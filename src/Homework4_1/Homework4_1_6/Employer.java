package Homework4_1.Homework4_1_6;
public class Employer
{
    private String firstName;
    private String lastName;
    private int income;
    public Employer(String firstName, String lastName, int income)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }
    public int getIncome()
    {
        return income;
    }
}