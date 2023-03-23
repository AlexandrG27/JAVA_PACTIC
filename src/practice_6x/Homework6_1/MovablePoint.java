package Practice_6X.Homework6_1;
public class MovablePoint implements Movable
{
    public static int speed=1;
    public static int countStep=0;
    public static int step=2;
    public static int x=-step;
    public static int y;
    public static int getCountStep()
    {
        return countStep;
    }
    public static void setStep(int step)
    {
        MovablePoint.step = step;
    }
    public static void setCountStep(int countStep)
    {
        MovablePoint.countStep += countStep;
    }
    public static int getStep()
    {
        return step;
    }
    public void moveUp()
    {
        if (countStep>=13)
        {
            Snake.getHeadBody().setLastCommand("U");
            Snake.addHistoryX(Snake.xHead());
            Snake.addHistoryY(Snake.yHead());
            Snake.addCommand("U");
            this.y=-step;
            this.x=0;
            countStep=0;
        }
    }
    public void moveDown()
    {
        if (countStep >= 13)
        {
            Snake.getHeadBody().setLastCommand("D");
            Snake.addHistoryX(Snake.xHead());
            Snake.addHistoryY(Snake.yHead());
            Snake.addCommand("D");
            this.y = step;
            this.x = 0;
            countStep = 0;
        }
    }
    public void moveLeft()
    {
        if (countStep>=13)
        {
            Snake.getHeadBody().setLastCommand("L");
            Snake.addHistoryX(Snake.xHead());
            Snake.addHistoryY(Snake.yHead());
            Snake.addCommand("L");
            this.y=0;
            this.x=-step;
            countStep=0;
        }
    }
    public void moveRight()
    {
        if (countStep>=13)
        {
            Snake.getHeadBody().setLastCommand("R");
            Snake.addHistoryX(Snake.xHead());
            Snake.addHistoryY(Snake.yHead());
            Snake.addCommand("R");
            this.y=0;
            this.x=step;
            countStep=0;
        }
    }
    public void addSpeed()
    {
        setStep(step*4);

    }
    public void turnSpeed()
    {
        setStep(step*4);
        if(x!=0)
            setX(x/4);
        if(y!=0)
            setY(y/4);
    }
    public static int getSpeed()
    {
        return speed;
    }
    public static void setY(int y)
    {
        MovablePoint.y = y;
    }
    public static void setX(int x)
    {
        MovablePoint.x = x;
    }
    public static int getX()
    {
        return x;
    }
    public static int getY()
    {
        return y;
    }
}
