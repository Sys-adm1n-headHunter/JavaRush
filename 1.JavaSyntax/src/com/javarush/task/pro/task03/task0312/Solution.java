package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);

        String strOne = scanner.nextLine();
        String strTwo = scanner.nextLine();

        if (strOne.equals(strTwo)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }

    }
}
