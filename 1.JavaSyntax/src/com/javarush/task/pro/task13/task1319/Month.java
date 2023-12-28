package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код

    public static Month [] getWinterMonths(){
        Month [] months = new Month[3];
        months[0] = Month.DECEMBER;
        months[1] = Month.JANUARY;
        months[2] = Month.FEBRUARY;

        return  months;
    }

    public static Month [] getSpringMonths(){
        Month [] months = new Month[3];
        months[0] = Month.MARCH;
        months[1] = Month.APRIL;
        months[2] = Month.MAY;

        return  months;
    }

    public static Month [] getSummerMonths(){
        Month [] months = new Month[3];
        months[0] = Month.JUNE;
        months[1] = Month.JULY;
        months[2] = Month.AUGUST;

        return  months;
    }

    public static Month [] getAutumnMonths(){
        Month [] months = new Month[3];
        months[0] = Month.SEPTEMBER;
        months[1] = Month.OCTOBER;
        months[2] = Month.NOVEMBER;

        return  months;
    }

}
