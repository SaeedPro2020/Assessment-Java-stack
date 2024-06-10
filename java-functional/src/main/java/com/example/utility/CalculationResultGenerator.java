package com.example.utility;

import java.math.BigDecimal;

public class CalculationResultGenerator {
    public static String generateCalculationResult(BigDecimal num1, BigDecimal result, BigDecimal roundedResult) {
        return String.format("%s / %s = %s, rounded up to %s", num1, num1.min(num1), result, roundedResult);
    }
}
