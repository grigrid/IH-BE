package com.day21sept.aboutbigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number1 = BigDecimal.valueOf(4.2549);
        BigDecimal number2 = BigDecimal.valueOf(1.2345);
        BigDecimal number3 = BigDecimal.valueOf(-45.67);
        BigDecimal result1 = roundedNum(number1);
        BigDecimal result2 = reverseSign(number2);
        BigDecimal result3 = reverseSign(number3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static BigDecimal roundedNum(BigDecimal num){
        return num.setScale(2, RoundingMode.HALF_EVEN);
    }

    public static BigDecimal reverseSign ( BigDecimal num){
        double bigToDbNum = num.floatValue();
        if ( bigToDbNum < 0) {
            return BigDecimal.valueOf(bigToDbNum).abs().setScale(1, RoundingMode.HALF_EVEN);
        } else {
            return  num.setScale(1, RoundingMode.HALF_EVEN);
        }

    }
}
