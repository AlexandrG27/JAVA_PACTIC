package Homework4_1.Homework4_1_8;
public class Circle extends Shape{
    protected double radius;

    public Circle()
    {}
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
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