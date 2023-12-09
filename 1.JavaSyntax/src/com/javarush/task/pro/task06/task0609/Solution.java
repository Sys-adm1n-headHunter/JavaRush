package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

public class Solution {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(ninthDegree(a));

    }

    public static long cube(long a){
        return a*a*a;
    }

    //напишите тут ваш код

    public static long ninthDegree(long a){
        a = cube(a);
        a = cube(a);
        return a;
    }
}
