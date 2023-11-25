package com.javarush.task.pro.task03.task0314;

import java.util.Locale;
import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        secret = secret.toLowerCase();
        word = word.toLowerCase();

        if (secret.equals(word)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }

    }
}
