package Practice_2X;
public class Dog {
    private String name;
    private int age;
    Dog(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public int ChangeAge()
    {
        return 7*age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String ToString()
    {
        return "Кличка: "+name+"\n"+
                "Возраст: " +age+"\n";
    }
}
