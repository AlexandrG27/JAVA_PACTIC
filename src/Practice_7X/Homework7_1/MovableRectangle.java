package Practice_7X.Homework7_1;
public class MovableRectangle implements Movable
{
    protected MovablePoint topLeft = new MovablePoint(0,0,0,0);
    protected MovablePoint bottomRight = new MovablePoint(0,0,0,0);
    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight)
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    @Override
    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    @Override
    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public boolean speedTest()
    {
        if(topLeft.SpeedTest() == bottomRight.SpeedTest())
            return true;

        return false;
    }
    @Override
    public String toString()
    {
        return String.format("TopLeft: %s\nBottomRight: %s\n", topLeft.toString(), bottomRight.toString());
    }
}