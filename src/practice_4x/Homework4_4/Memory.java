package Practice_4X.Homework4_4;
public class Memory
{
    private String name;
    private int price;
    private int Hz;
    private int size;
    public Memory(String name, int price, int hz, int size)
    {
        this.name = name;
        this.price = price;
        this.Hz = hz;
        this.size = size;
    }
    public int getHz()
    {
        return Hz;
    }
    public int getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
    public int getSize()
    {
        return size;
    }
    @Override
    public String toString()
    {
        return "Memory: " + "Brand '" + name + '\'' + ", price=" + price + ", Hz=" + Hz + ", size=" + size ;
    }
}