package com.example;

import com.example.utility.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String uuid = UUIDGenerator.generateUUID();
        String formattedDateTime = DateTimeGenerator.generateCurrentDateTime();
        BigDecimal num1 = new BigDecimal("59.3297");
        BigDecimal num2 = new BigDecimal("17.9868");

        BigDecimal divisionResult = DivisionCalculator.calculateDivision(num1, num2);
        BigDecimal roundedResult = ResultRounder.roundResult(divisionResult);
        String calculationResult = CalculationResultGenerator.generateCalculationResult(num1, num2, roundedResult);
        String md5Hash = MD5HashGenerator.generateMD5Hash(calculationResult);

        Container container = new Container(uuid, formattedDateTime, num1, num2, roundedResult, calculationResult, md5Hash);
        JsonFileWriter.writeToJsonFile(container, "output.json");

        System.out.println(container);
    }
}
