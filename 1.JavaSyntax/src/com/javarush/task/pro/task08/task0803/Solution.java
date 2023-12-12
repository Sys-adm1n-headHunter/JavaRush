package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int min = ints[0];
        for (int number : ints) {
            min = Math.min(min,number);
        }

        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        int[] temp = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < temp.length; i++) {
            temp[i] = scanner.nextInt();
        }

        return temp;
    }
}
