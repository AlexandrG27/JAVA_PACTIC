package Homework4_1.Homework4_1_1;
public class Shape
{
    private String Type;
    private int Area;
    private int Perimeter;
    public Shape(String Type, int Area, int Perimeter)
    {
        this.Type = Type;
        this.Area=Area;
        this.Perimeter=Perimeter;
    }
    public int getArea()
    {
        return Area;
    }
    public int getPerimeter()
    {
        return Perimeter;
    }
    public String getType()
    {
        return Type;
    }
    @Override
    public String toString()
    {
        return "Shape{" + "Type='" + Type + '\'' + ", Area=" + Area + ", Perimeter=" + Perimeter + '}';
    }
}