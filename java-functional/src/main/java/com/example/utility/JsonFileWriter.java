package com.example.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonFileWriter {
    public static void writeToJsonFile(String filePath, Container container) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filePath), container);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
