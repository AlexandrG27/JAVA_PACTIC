package Practice_2X;
public class Circle {
    private double Radius=0.0;
    private Point Point = new Point(0,0);
    Circle(Point point)
    {
        Point = point;
    }
    Circle(int x, int y)
    {
        Point = new Point(x,y);
    }
    public String ToString()
    {
        return String.format("x: %s y:%s",Point.GetX(), Point.GetX());
    }
}
