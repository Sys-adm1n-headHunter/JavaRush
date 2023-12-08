package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишите тут ваш код
        result[0] = new int[1];
        result[1] = new int[2];
        result[2] = new int[3];
        result[3] = new int[4];
        result[4] = new int[5];
        result[5] = new int[6];
        result[6] = new int[7];
        result[7] = new int[8];
        result[8] = new int[9];
        result[9] = new int[10];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i+j;
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
