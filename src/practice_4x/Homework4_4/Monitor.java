package Practice_4X.Homework4_4;
public class Monitor
{
    private String name;
    private int price;
    private int diagonal;
    private String matrix;
    private int Hz;
    public Monitor(String name,int price, int diagonal, String matrix, int hz)
    {
        this.name=name;
        this.price = price;
        this.diagonal = diagonal;
        this.matrix = matrix;
        this.Hz = hz;
    }
    public String getName()
    {
        return name;
    }
    public String getMatrix()
    {
        return matrix;
    }
    public int getHz()
    {
        return Hz;
    }
    public int getDiagonal()
    {
        return diagonal;
    }
    public int getPrice()
    {
        return price;
    }
    @Override
    public String toString()
    {
        return "Monitor: " + "Brand '" + name + '\'' + ", price=" + price + ", diagonal=" + diagonal + ", matrix='" + matrix + '\'' + ", Hz=" + Hz;
    }
}
