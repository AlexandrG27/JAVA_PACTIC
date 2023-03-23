package Practice_4X.Homework4_2;
public abstract class Clothes
{
    private Size size;
    private int price;
    private String color;
    Clothes(Size size,int price, String color)
    {
        this.size=size;
        this.price=price;
        this.color=color;
    }

    public int getPrice()
    {
        return price;
    }
    public Size getSize()
    {
        return size;
    }
    public String getColor()
    {
        return color;
    }
}
