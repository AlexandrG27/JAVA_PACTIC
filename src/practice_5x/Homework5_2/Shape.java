package Practice_5X.Homework5_2;
import java.awt.*;
import java.util.Random;
public abstract class Shape
{
    private Color color;
    Color[] colors={Color.BLACK,Color.BLUE,Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,
            Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED};
    private int x;
    private int y;
    private int width;
    private int height;
    public Shape(int x, int y)
    {
        this.width=getWidth();
        this.height=getHeight();
        this.color=new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        this.x = x;
        this.y = y;
    }
    public int getHeight()
    {
        Random random =new Random();
        return height= random.nextInt(50,80);
    }
    public int getWidth()
    {
        Random random =new Random();
        return width=random.nextInt(50,80);
    }
    public int getY()
    {
        return y;
    }
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public Color getColor()
    {
        return color;
    }
}