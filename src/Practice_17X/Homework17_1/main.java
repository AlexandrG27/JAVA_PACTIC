package Practice_17X.Homework17_1;
public class main
{
    public static void main(String[] args)
    {
        Student model=retriveCourseFromDate();
    }
    private static Student retriveCourseFromDate()
    {
        Student student = new Student();
        student.setName("Java");
        student.setRollNo("01");
        return student;
    }
}
