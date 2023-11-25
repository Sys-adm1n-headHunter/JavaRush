package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = scanner.nextInt();
        
        if(a>=18){
            if(a<=28){
                System.out.println(s + militaryCommissar);
            }
        }
    }
}
