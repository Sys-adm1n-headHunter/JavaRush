package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber < 0 || decimalNumber == 0)
            return "";

        String hex = "";

        char[] array = HEX.toCharArray();

        while (decimalNumber > 0) {
            hex = array[decimalNumber % 16] + hex;
            decimalNumber = decimalNumber / 16;
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == "" || hexNumber == null)
            return 0;
        int decimal = 0;
        char[] array = hexNumber.toCharArray();
        for (int i = 0; i < hexNumber.length(); i++) {
            decimal = 16 * decimal + HEX.indexOf(array[i]);
        }
        return decimal;
    }
}
