package Practice_2X;
public class CircleTest {
    public static void main(String[] args)
    {
        Circle circleArg1 = new Circle(new Point(10,10));
        Circle circleArg2 = new Circle(5,5);
        System.out.println(circleArg1.ToString());
        System.out.println(circleArg2.ToString());
    }
}