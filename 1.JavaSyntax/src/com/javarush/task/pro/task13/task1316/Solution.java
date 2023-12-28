package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] javarushQuests = JavarushQuest.values();

        for (JavarushQuest javarushQuest: javarushQuests) {
            System.out.println(javarushQuest.ordinal());
        }
    }
}
