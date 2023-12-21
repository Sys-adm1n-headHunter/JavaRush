package com.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(this.salary<salary)
        this.salary = salary;
    }

    private int salary = 1000;

    //напишите тут ваш код

}
