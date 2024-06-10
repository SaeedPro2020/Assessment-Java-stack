package com.example;

import com.example.utility.Container;
import com.example.utility.JsonFileWriter;

public class Main {
    public static void main(String[] args) {
        // Create container object
        Container container = new Container();
        
        // Print container details
        System.out.println(container);

        // Write to JSON file
        JsonFileWriter.writeToJsonFile("output.json", container);
    }
}
