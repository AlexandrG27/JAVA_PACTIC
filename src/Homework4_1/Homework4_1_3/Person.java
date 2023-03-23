package Homework4_1.Homework4_1_3;
public class Person
{
    public static void main(String[] args)
    {
        Person person=new Person("Ivan",19);
        System.out.println(person.toString());
        Person person1=new Person();
        System.out.println(person1.toString());
    }
    private String fullName;
    private int age;
    public Person()
    {}
    public Person(String fullName, int age)
    {
        this.fullName = fullName;
        this.age = age;
    }
    public void move()
    {
        System.out.println("Такой-то Person говорит");
    }
    public void talk()
    {
        System.out.println("Такой-то Person говорит");
    }
    @Override
    public String toString() {
        return "Person{" + "fullName='" + fullName + '\'' + ", age=" + age + '}';
    }
}