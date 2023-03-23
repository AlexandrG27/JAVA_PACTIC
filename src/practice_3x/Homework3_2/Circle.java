package Practice_3X.Homework3_2;
import java.util.*;
public class Circle {
    private Point point;
    private int R;
    private int C;
    Circle()
    {
        Random rand = new Random();
        point=new Point();
        R=rand.nextInt(100);
        C= (int) (2*Math.PI*R);
    }
    Circle(int R, int C)
    {
        this.R=R;
        this.C=C;
        point=new Point();
    }
    public void move (int x,int y)
    {
        point.setX(x);
        point.setY(y);
    }
    public int getC()
    {
        return C;
    }
    public int getR()
    {
        return R;
    }
    public String ToString()
    {
        return "Point:"+point.ToString()+"\n"+ "Радиус:" +R+"\n"+ "Длина окружности:"+C;
    }
}
