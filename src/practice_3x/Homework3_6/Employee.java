package Practice_3X.Homework3_6;
public class Employee
{
    private String fullName;
    private double salary;
    public Employee(String fullName, double salary)
    {
        this.fullName = fullName;
        this.salary = salary;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getFullName()
    {
        return fullName;
    }
}