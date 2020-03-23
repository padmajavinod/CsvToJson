package com.csvtojson.csvtojson;

import org.apache.catalina.valves.rewrite.RewriteCond;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


@Component
public class Mainconverter //implements Function<String, List<?>> {
{

    //   @Override
    public List<Map<String, String>> apply(String s) {
        List<Map<String, String>> list = new ArrayList<>();
        try (BufferedReader in = new BufferedReader((new FileReader(s)));) {
            in.lines().findFirst().ifPresent(t -> {
                List<String> fieldNames = Arrays.asList(t.split(","));


                in.lines().skip(1).filter(p -> !p.isEmpty()).forEach(o -> {
                    List<String> x = Arrays.asList(Constats.pattern.split(o, fieldNames.size()));
                    Map<String, String> obj = new LinkedHashMap<>();
                    for (int i = 0; i < fieldNames.size(); i++) {
                        obj.put(fieldNames.get(i), x.get(i));
                    }
                    list.add(obj);
                });


                in.lines().skip(1).filter(p -> !p.isEmpty()).map(o -> {
                    List<String> x = Arrays.asList(Constats.pattern.split(o, fieldNames.size()));
                    Map<String, String> obj = new LinkedHashMap<>();
                    for (int i = 0; i < fieldNames.size(); i++) {
                        obj.put(fieldNames.get(i), x.get(i));
                    }
                    list.add(obj);
                    return null;
                });

            });
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

//
//    @Override
//    public Object apply(Object o) {
//        return null;
//    }
}
