package Homework4_1.Homework4_1_7;
public class Schoolboy extends learner
{
    private String firstName;
    private String lastName;
    private int сlas;
    public Schoolboy(String firstName, String lastName, int clas)
    {
        super(firstName, lastName);
        this.сlas=clas;
    }
    public int getСlas()
    {
        return сlas;
    }
    @Override
    public String toString()
    {
        return super.toString()+", класс: "+getСlas();
    }
}