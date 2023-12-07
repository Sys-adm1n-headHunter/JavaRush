package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean type = scanner.nextBoolean();
        int round;

        if(type){
            round = (int)Math.ceil(glass);
        }else{
            round = (int)Math.floor(glass);
        }

        System.out.println(round);

    }
}