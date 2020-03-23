package com.csvtojson.csvtojson.services;

import com.csvtojson.csvtojson.Mainconverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class CsvToJsonService {

    @Autowired
    Mainconverter mainconverter;

    public List<Map<String, String>> convertCsvToJsonWithoutPojo(String csvPath) {
        return mainconverter.apply(csvPath);

    }
}
