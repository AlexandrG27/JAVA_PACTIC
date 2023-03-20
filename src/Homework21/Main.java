package ru.mirea.lab1.Homework21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;

public class Main {
    public static Integer[] numbers = new Integer[] { 1, 2, 3 };
    public static String[] str = new String[] { "a","b","c" };
    public static void main(String[] args) {
        //Задание 1

        System.out.println("Задание 1");
        List<?> list = Arrays.asList(str);
        System.out.println(Arrays.toString(list.toArray()));

        // Задание 2
        System.out.println('\n'+"Задание 2");
        Date obj = new Date<Long>( new Long[]{1l,324l,43l});
        obj.printDate();

        //Задание 3
        System.out.println('\n'+"Задание 3");
        returnIndex(2);

        //Задание 4

        System.out.println('\n'+"Задание 4");

        File dir =new File("."); // . - обозначение для текущего каталога
        List<String> list1 = List.of(dir.list()); // Сохраняем каталог в список

        for (int i=0; i<5; i++)
            System.out.println(list1.get(i));


    }

    public static void returnIndex(int i)
    {
        System.out.println("Значение элемента массива под номером: "+i+" = "+ str[i]);
    }
}
