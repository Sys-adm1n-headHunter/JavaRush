package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
                int b = scanner.nextInt();
                        int c = scanner.nextInt();
        
        int d = (a + b +c )/3;
        
        System.out.println(d);


    }
}
