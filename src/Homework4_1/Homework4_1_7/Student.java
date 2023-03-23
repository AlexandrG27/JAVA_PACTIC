package Homework4_1.Homework4_1_7;
public class Student extends learner
{
    private String firstName;
    private String lastName;
    private int course;
    public Student(String firstName, String lastName, int course)
    {
        super(firstName, lastName);
        this.course=course;
    }
    public int getCourse()
    {
        return course;
    }
    @Override
    public String toString()
    {
        return super.toString()+", курс: "+getCourse();
    }
}