package com.csvtojson.csvtojson;

import java.util.regex.Pattern;

public interface Constats {

    Pattern pattern = Pattern.compile(",");
    String SOURCE_PATH = "src/main/resources/contact-list.csv";
}
