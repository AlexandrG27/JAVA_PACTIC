package Practice_13X.Part_1;
public class Person
{
    private String surname;
    private String name="";
    private String patronymic="";

    public Person(String surname) {
        this.surname = surname;
    }
    public Person(String surname, String name)
    {
        this.surname = surname;
        this.name = name;
    }
    public Person(String surname, String name, String patronymic)
    {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    @Override
    public String toString()
    {
        return surname+" "+name+" "+patronymic;
    }
}
