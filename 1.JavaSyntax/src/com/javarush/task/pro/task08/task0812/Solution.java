package com.javarush.task.pro.task08.task0812;

/* 
Swap по-новому
*/
/*
x = 4 (0100)
y = 5 (0101)
x = x ^ y (0101 ^ 0100 = 0001), x равен 0001 теперь
y = y ^ x (0101 ^ 0001 = 0100) y равен 0100, т.е игрек (Y) уже равен 4
x = x ^ y (0001 ^ 0100 = 0101) x равен 0101, т.е x равен 5
 */

public class Solution {
    public static void main(String[] args) {
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}
