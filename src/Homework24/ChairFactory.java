package ru.mirea.lab1.Homework24;

import ru.mirea.lab1.Homework24.SuperChair;
import ru.mirea.lab1.Homework24.MagicalChair;
import ru.mirea.lab1.Homework24.VictorianChair;
import ru.mirea.lab1.Homework24.MultifunctionalChair;


public class ChairFactory {

    public static SuperChair getChair(String type, String material, String legs, String back)
    {
        if("Викторианский".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else if ("Универсальный".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else if ("Магический".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else
            return null;

    }
}
