package Homework4_1.Homework4_1_8;
public class Rectangle extends Shape
{
    protected  double width;
    protected double length;

    public Rectangle() {
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    @Override
    double getPerimeter()
    {
        return 0;
    }
    @Override
    double gerArea()
    {
        return 0;
    }
    @Override
    public String toString()
    {
        return super.toString();
    }
}