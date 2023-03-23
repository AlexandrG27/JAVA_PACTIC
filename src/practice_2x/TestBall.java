package Practice_2X;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args)
    {
        Ball ball = new Ball (10,10);
        System.out.println(ball);
        ball.move(15, 27);
        System.out.println(ball);
    }
}