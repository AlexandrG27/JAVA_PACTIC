package ru.mirea.lab1.Homework21;

import java.util.Arrays;

public class Date <T>{
    private T[] date;

    public Date(T[] date) {
        this.date = date;
    }
     public void printDate()
     {
         System.out.println("Тип: "+date.getClass().getName());
         System.out.println("Значение "+Arrays.toString(date));

     }
}
