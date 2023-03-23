package Practice_4X.Homework4_4;
public class CPU
{
    private String name;
    private int price;
    private double Hz;
    private int core;

    public CPU(String name, int price, double hz, int core) {
        this.name = name;
        this.price = price;
        this.Hz = hz;
        this.core = core;
    }
    public int getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
    public int getCore()
    {
        return core;
    }
    public double getHz()
    {
        return Hz;
    }
    @Override
    public String toString()
    {
        return "CPU: " +"Brand '" + name + '\'' +", price=" + price +", Hz=" + Hz +", core=" + core;
    }
}