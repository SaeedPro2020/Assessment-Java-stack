package com.example.utility;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

public class Container {

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("dateTime")
    private String dateTime;

    @JsonProperty("num1")
    private BigDecimal num1;

    @JsonProperty("num2")
    private BigDecimal num2;

    @JsonProperty("roundedResult")
    private BigDecimal roundedResult;

    @JsonProperty("calculationResult")
    private String calculationResult;

    @JsonProperty("md5Hash")
    private String md5Hash;

    // Constructor
    public Container() {
        this.uuid = UUIDGenerator.generateUUID();
        this.dateTime = DateTimeGenerator.generateCurrentDateTime();
        this.num1 = generateRandomDecimal();
        this.num2 = generateRandomDecimal();
        BigDecimal result = DivisionCalculator.calculateDivision(num1, num2);
        this.roundedResult = ResultRounder.roundResult(result);
        this.calculationResult = CalculationResultGenerator.generateCalculationResult(num1, result, roundedResult);
        this.md5Hash = MD5HashGenerator.generateMD5Hash(uuid + dateTime + roundedResult);
    }

    // Generate a random decimal number between 1 and 100 with a scale of 4
    @SuppressWarnings("deprecation")
    private BigDecimal generateRandomDecimal() {
        return BigDecimal.valueOf(1 + (100 - 1) * Math.random()).setScale(4, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public String toString() {
        return "Container{" +
                "uuid='" + uuid + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", roundedResult=" + roundedResult +
                ", calculationResult='" + calculationResult + '\'' +
                ", md5Hash='" + md5Hash + '\'' +
                '}';
    }
}
