package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int speedMS = scanner.nextInt();
        int speedKmH = (int) Math.round(3.6 *speedMS);
        System.out.println(speedKmH);

    }
}