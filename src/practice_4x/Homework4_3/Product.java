package Practice_4X.Homework4_3;
public abstract class Product
{
    private String name;
    private String annotation;
    private int price;
    Product(String annotation, String name,int price )
    {
        this.annotation=annotation;
        this.name=name;
        this.price=price;
    }
    public String getAnnotation()
    {
        return annotation;
    }
    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
    public String ToString()
    {
        return annotation+" "+name+" "+price+" руб";
    }
}
