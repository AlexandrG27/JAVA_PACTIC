package Homework4_1.Homework4_1_7;
public class learner
{
    private String firstName;
    private String lastName;
    public learner(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString()
    {
        return "Учащийся: " + "Фамилия - '" + firstName + '\'' + ", Имя - '" + lastName + '\'';
    }
}