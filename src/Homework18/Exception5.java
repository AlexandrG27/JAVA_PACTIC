package ru.mirea.lab1.Homework18;

import java.util.Objects;
import java.util.Scanner;

public class Exception5 {
    public static void main(String[] args) {
        getKey();
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

    public static void getKey() {

        String key="";
        for (int i=0; i<2;)
        {
            Scanner myScanner = new Scanner( System.in);

            try {
                key = myScanner.nextLine();
                printDetails( key );
                i++;
            }
            catch (Exception exception)
            {
                System.out.println("Повторитре ввод");
            }

        }

    }
}
