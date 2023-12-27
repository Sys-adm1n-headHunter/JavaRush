package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Иван Иванов", 4.2);
        grades.put("Олег Иванов", 3.75);
        grades.put("Артём Иванов", 4.9);
        grades.put("Валера Иванов", 3.1);
        grades.put("Дима Иванов", 5.0);
    }
}
