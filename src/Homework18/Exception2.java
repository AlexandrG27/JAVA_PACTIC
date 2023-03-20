package ru.mirea.lab1.Homework18;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);

        }


        catch (NumberFormatException exception)
        {
            System.out.println("ошибка ввода");
        }

        finally {
            System.out.println("finally выполняется в любом случае независимо от результатов выполнения блока try.");
        }


    }
}
