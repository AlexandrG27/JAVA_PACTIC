package Practice_6X.Homework6_2;
public class Shop implements Printable
{
    private String name;
    public Shop(String name)
    {
        this.name = name;
    }
    @Override
    public void print()
    {
        System.out.println("Журнал: "+ name);
    }
}