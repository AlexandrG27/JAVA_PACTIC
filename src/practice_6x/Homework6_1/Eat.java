package Practice_6X.Homework6_1;
import java.util.Random;
public class Eat
{
    public static int x=250;
    public static int y=255;
    private final int width=15;
    private final int height =15;
    private static boolean aBoolean=false;

    public static boolean isaBoolean()
    {
        return aBoolean;
    }
    public static void setBoolean(boolean Boolean)
    {
        aBoolean = Boolean;
    }
    public static int getX()
    {
        return x;
    }
    public static int getY()
    {
        return y;
    }
    public static void setXY()
    {
        Random random = new Random();
        x = random.nextInt(450);
        y = random.nextInt(450);
    }
    public int getHeight()
    {
        return height;
    }
    public int getWidth()
    {
        return width;
    }
}