package com.csvtojson.csvtojson.controllers;

import com.csvtojson.csvtojson.Constats;
import com.csvtojson.csvtojson.services.CsvToJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {
    @Autowired
    CsvToJsonService csvToJsonService;

    @GetMapping("/convertCsvToJsonWithoutPojo")
    public List<Map<String, String>> convertCsvToJsonWithoutPojo() {

        return csvToJsonService.convertCsvToJsonWithoutPojo(Constats.SOURCE_PATH);
    }
}
