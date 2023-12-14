package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }


    public static String toHex(String binaryNumber) {
        // создаем двумерный массив значений при двойчной и шестнадцатиричной кодировках.
        String[][] BinaryHex2DArray = {{"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"}, {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"}};

        String hex = "";                                               // проверяем на null
        if (binaryNumber == null) {
            return hex;
        }

        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = 0 + binaryNumber;
        }   // приводим длину строки к виду кратному 4.

        char[] binaryNumberToArray = binaryNumber.toCharArray();               // создаем из строки массив символов.

        for (char bin : binaryNumberToArray) {                                  // проверяем на 0 и 1.
            if (bin != '1' && bin != '0') {
                return hex;
            }
        }

        // создеам двумерный массив чтобы разбить массив по 4 бита
        char[][] binaryNumberTo2DArray = new char[binaryNumberToArray.length / 4][4];
        // заполняем двумерный мерный массив значениями.
        int count = 0;
        for (int i = 0; i < binaryNumberTo2DArray.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (binaryNumberToArray.length > count) {
                    binaryNumberTo2DArray[i][j] = binaryNumberToArray[count++];
                }
            }
        }
        String collector = "";
        // вытаскиваем по 4 бита из строки массива
        for (int i = 0; i < binaryNumberTo2DArray.length; i++) {
            for (int j = 0; j < 4; j++) {
                // собираем по 4 значения
                collector = collector + binaryNumberTo2DArray[i][j];
            }
            // и сразу сравниваем со значениями из заготовленного массива 2-16 кодировки
            for (int k = 0; k < BinaryHex2DArray[0].length; k++) {
                if (collector.equals(BinaryHex2DArray[0][k])) {
                    hex = hex + BinaryHex2DArray[1][k];         // собираем целую строку с двоичным выражением
                }
            }
            // обнуляем коллектор
            collector = "";
        }
        return hex;
    }

    public static String toBinary(String hexNumber) {

        // создаем двумерный массив значений при двойчной и шестнадцатиричной кодировках.
        String[][] BinaryHex2DArray = {{"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"}, {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"}};

        String binary = "";                                              // проверяем на null
        if (hexNumber == null) {
            return binary;
        }

        String[] hexNumberToArray = hexNumber.split("");             // переводим строку в строковый массив

        int count = 0;
        // проверяем на соответствие символов
        for (int j = 0; j < hexNumberToArray.length; j++) {
            for (int i = 0; i < BinaryHex2DArray[1].length; i++) {
                if (hexNumberToArray[j].equals(BinaryHex2DArray[1][i])) {
                    // если было совпадение, счетчик считает
                    count++;
                }
            }
        }
        // если совпадений было не столько сколько символов , значит какой то символ не соотвтетсвует
        if (count != hexNumberToArray.length) return binary;

        for (int i = 0; i < hexNumberToArray.length; i++) {
            for (int j = 0; j < BinaryHex2DArray[1].length; j++) {
                if (hexNumberToArray[i].equals(BinaryHex2DArray[1][j])) {
                    binary = binary + BinaryHex2DArray[0][j];
                }
            }
        }
        return binary;
    }
}