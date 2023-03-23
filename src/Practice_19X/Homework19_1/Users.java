package Practice_19X.Homework19_1;
public class Users
{
    private String surname;
    private String name;
    private String midName;
    private String tin;
    public Users(String surname, String name, String midName, String tin)
    {
        this.surname = surname;
        this.name = name;
        this.midName = midName;
        this.tin = tin;
    }
    public String getSurname()
    {
        return surname;
    }
    public String getName()
    {
        return name;
    }
    public String getMidName()
    {
        return midName;
    }
    public String getTin()
    {
        return tin;
    }
}