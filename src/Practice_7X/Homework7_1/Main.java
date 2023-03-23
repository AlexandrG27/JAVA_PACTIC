package Practice_7X.Homework7_1;
public class Main
{
    public static void main(String args[])
    {
        MovableRectangle movableRectangle = new MovableRectangle(new MovablePoint(0,0,0,0), new MovablePoint(0,0,0,0));
        movableRectangle.moveDown();
        movableRectangle.moveLeft();
        movableRectangle.moveLeft();
        movableRectangle.moveRight();
        boolean isSameSpeed = movableRectangle.speedTest();
        System.out.println(String.format("Точки:\n%sОдинаковая скорость: %s",movableRectangle.toString(), isSameSpeed));
    }
}
