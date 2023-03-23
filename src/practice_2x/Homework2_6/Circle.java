package Practice_2X.Homework2_6;
import java.util.*;
public class Circle
{
    private double r=0.0;
    private double d=0.0;
    private double c=0.0;
    private double s=0.0;
    Circle(double r)
    {
        this.r=r;
        this.d=2*r;
        findS();
        findC();
    }
    public void findS()
    {
        s=Math.PI*d;
    }
    public void findC()
    {
        c=2*Math.PI*r;
    }
    public void setR(double r)
    {
        this.r=r;
    }
    public void setD(double d)
    {
        this.d=d;
    }
    public void setC(double c)
    {
        this.c=c;
    }
    public void setS(double s)
    {
        this.s=s;
    }
    public double getR()
    {
        return r;
    }
    public double getD()
    {
        return d;
    }
    public double getC()
    {
        return c;
    }
    public double getS()
    {
        return s;
    }
    public String ToString()
    {
        return "Радиус: "+r+"\n"+ "Диаметр: " +d+"\n"+ "Длина окружности: "+c+"\n"+ "Площадь окржуности: "+s;
    }
}
