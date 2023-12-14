package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber > 0) {
            String ddecimalOctal = "";
            while (decimalNumber > 0) {
                int oststok = decimalNumber % 8;
                ddecimalOctal = oststok + ddecimalOctal;
                decimalNumber /= 8;
            }
            return (int) Double.parseDouble(ddecimalOctal);
        }
        return 0;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber > 0) {
            String linghtnum = "" + octalNumber;
            linghtnum = String.valueOf(linghtnum.length());
            int[] number = new int[(int) Double.parseDouble(linghtnum)];
            int res = 0;
            for (int i = 0; i < number.length; i++) {
                number[i] = octalNumber % 10;
                octalNumber /= 10;
            }
            for (int i = 0; i < number.length; i++) {
                number[i] = (int) (number[i] * Math.pow(8, i));
            }
            for (int i = 0; i < number.length; i++) {
                res += number[i];
            }
            return res;
        }


        return 0;
    }
}
