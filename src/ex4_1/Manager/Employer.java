package ex4_1.Manager;

import java.util.Scanner;

public class Employer
{
    private String firstName, lastName;
    private static double income, AverageWorkDay;
    public Employer(String firstName, String lastName, double AverageWorkDay, double averageSum, double income)
    {
        getIncome(AverageWorkDay, income, averageSum);
    }
    public static double getIncome(double AverageWorkDay, double income, double averageSum)
    {
        if (AverageWorkDay>15)
        {
            return (income *= 12) + averageSum;
        }
        else
        return income + averageSum;
    }
}
