package Homework4_1.Homework4_1_8;
public class Square extends Rectangle
{
    public double side;
    public Square() { }
    public Square(double side) { }
    public Square(String color, boolean filled, double side) { }

    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }
    @Override
    public void setWidth(double width)
    {
        super.setWidth(width);
    }
    @Override
    public void setLength(double length)
    {
        super.setLength(length);
    }
    @Override
    public String toString()
    {
        return super.toString();
    }
}