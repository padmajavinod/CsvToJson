package com.csvtojson.csvtojson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@SpringBootApplication
public class CsvtojsonApplication {


    public static void main(String[] args) {
        SpringApplication.run(CsvtojsonApplication.class, args);

    }

}
