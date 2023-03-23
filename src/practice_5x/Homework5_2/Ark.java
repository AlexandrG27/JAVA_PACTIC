package Practice_5X.Homework5_2;
import java.awt.*;
import java.util.Random;
public class Ark extends Shape
{
    private int startAngle;
    private int arkAngle;
    public Ark(int x, int y)
    {
        super(x, y);
        this.arkAngle=getArkAngle();
        this.startAngle=getStartAngle();
    }
    @Override
    public int getY()
    {
        return super.getY();
    }
    @Override
    public int getX()
    {
        return super.getX();
    }
    @Override
    public Color getColor()
    {
        return super.getColor();
    }
    @Override
    public int getHeight()
    {
        return super.getHeight();
    }
    @Override
    public int getWidth()
    {
        return super.getWidth();
    }
    public int getArkAngle()
    {
        Random random =new Random();
        return arkAngle=random.nextInt(180);
    }
    public int getStartAngle()
    {
        Random random =new Random();
        return startAngle=random.nextInt(180);
    }
}
