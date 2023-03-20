package Ex2.ball;

public class BallTest {
    public static void main(String[] args) {
        Ball a = new Ball();
        System.out.println(a.toString());
        for (int i = 0; i < 3;i ++)
        {
            a.move(11 , 15);
            System.out.println(a.toString());
        }
    }
}
