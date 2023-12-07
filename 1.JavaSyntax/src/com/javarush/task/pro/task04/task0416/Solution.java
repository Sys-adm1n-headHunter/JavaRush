package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int colaCount = scanner.nextInt();
        int peopleCount = scanner.nextInt();
        double avg = colaCount/(double) peopleCount;
        System.out.println(avg);

    }
}