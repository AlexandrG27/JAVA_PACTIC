package Practice_7X.Homework7_1;
public class MovablePoint implements Movable
{
    protected int x = 0;
    protected int y = 0;
    protected int xSpeed = 0;
    protected int ySpeed = 0;
    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveDown()
    {
        if(ySpeed != 0)
            y += ySpeed;
        else
            y += -1;

        ySpeed += -1;
    }
    @Override
    public void moveLeft()
    {
        if(xSpeed != 0)
            x += xSpeed;
        else
            x += -1;

        xSpeed += -1;
    }
    @Override
    public void moveRight()
    {
        if(xSpeed != 0)
            x += xSpeed;
        else
            x += 1;
        xSpeed += 1;
    }
    @Override
    public void moveUp()
    {
        if(ySpeed != 0)
            y += ySpeed;
        else
            y += 1;
        ySpeed += 1;
    }
    public int SpeedTest()
    {
        return xSpeed + ySpeed;
    }
    @Override
    public String toString()
    {
        return String.format("x: %s; y: %s; xSpeed: %s; ySpeed: %s;",x,y,xSpeed,ySpeed);
    }
}