package Practice_6X.Homework6_1;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class Body extends Snake
{
    private int index;
    static int step=1;
    private int x;
    private  int y;
    public  String lastCommand;
    public static int countBody=0;
    private static int sizeBody=0;
    public Body( int x, int y,int index, String Command)
    {
        this.x =x;
        this.y =y;
        this.index=index;
        this.lastCommand=Command;
    }
    public int getIndex()
    {
        return index;
    }
    public void setIndex(int index)
    {
        this.index += index;
    }
    public void setLastCommand(String command)
    {
        this.lastCommand = command;
    }
    public String getLastCommand()
    {
        return lastCommand;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public static void setSizeBody(int sizeBody)
    {
        Body.sizeBody += sizeBody;
    }
    public static int getSizeBody()
    {
        return sizeBody;
    }
    public static int getCountBody()
    {
        return countBody;
    }
    public static void setCountBody(int value)
    {
        countBody  += value;
    }
}