package ru.mirea.lab1.Homework18;

import java.util.Objects;
import java.util.Scanner;

public class Exception4 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.nextLine()
                ;
        printDetails( key );
    }
    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch ( Exception e){
            throw e;
        }
    }
    public static String getDetails(String key)
    {

        if(Objects.equals(key, ""))
        {

            try {
                throw new Exception("Key set to empty string");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }
        return "data for " + key; }
}

