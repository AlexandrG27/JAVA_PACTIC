package Practice_19X.Homework19_2;
public class Student
{
    private String surname;
    private String name;
    private String midName;
    private int GPA;
    public Student(String surname, String name, String midName, int GPA)
    {
        this.surname = surname;
        this.name = name;
        this.midName = midName;
        this.GPA = GPA;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getMidName()
    {
        return midName;
    }
    public void setMidName(String midName)
    {
        this.midName = midName;
    }
    public int getGPA()
    {
        return GPA;
    }
    public void setGPA(int GPA)
    {
        this.GPA = GPA;
    }
    @Override
    public String toString() {
        return "Student{" + "surname='" + surname + '\'' + ", name='" + name + '\'' +
                ", midName='" + midName + '\'' + ", GPA=" + GPA + '}';
    }
}
