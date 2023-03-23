package Homework4_1.Homework4_1_6;
public class Manager extends Employer
{
    private String firstName;
    private String lastName;
    private int income;
    private double averageSum;
    public Manager(String firstName, String lastName, int income, double averageSum)
    {
        super(firstName,lastName,income);

        this.averageSum = averageSum;
    }
    @Override
    public int getIncome()
    {
        return super.getIncome()+2500;
    }
}