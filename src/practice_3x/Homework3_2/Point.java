package Practice_3X.Homework3_2;
import java.util.Random;
public class Point {
    private int x =0;
    private int y =0;
    Point()
    {
        Random rand = new Random();
        x=rand.nextInt(100);
        y=rand.nextInt(100);

    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public String ToString()
    {
        return "x="+x+ " y=" +y;
    }
}