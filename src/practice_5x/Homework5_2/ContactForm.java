package Practice_5X.Homework5_2;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class ContactForm extends JPanel
{
    private int x=25;
    private int y=20;
    private int countShape=0;
    public int random(int value)
    {
        Random random = new Random();
        return random.nextInt(value, value + 50);
    }
    public int randomPoint()
    {
        Random random = new Random();
        return random.nextInt(2,3);
    }
    public void setX(int x)
    {
        if ((countShape==8)||(countShape==0))
        {
            this.x=25;
        }
        else if (countShape==0)
        {
            this.x=25;
        }
        else
            this.x = x+110;
    }
    public void setY(int y)
    {
        if (countShape==8)
        {
            countShape=0;
            this.y = y+150;
        }
        else
            this.y=y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void paint(Graphics g)
    {
        Random random=new Random();
        super.paint(g);
        g.setColor(Color.gray);
        for (int j=0; j<24;j++)
        {
            setX(x);
            setY(y);
            g.setColor(Color.BLACK);
            g.fillRect(getX()-15, getY()-30, 105, 130);
            g.drawString(Integer.toString(j+1),getX()+30,getY()+110);
            countShape++;
            int rand=random.nextInt(1,7);
            switch (rand)
            {
                case 1:
                    Rect rect=new Rect(getX(),getY());
                    g.setColor(rect.getColor());
                    g.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
                    continue;
                case 2:
                    Rect oval=new Rect(getX(),getY());
                    g.setColor(oval.getColor());
                    g.fillOval(oval.getX(),oval.getY(), oval.getWidth(), oval.getHeight());
                    continue;
                case 3:
                    Ark ark=new Ark(getX(),getY());
                    g.setColor(ark.getColor());
                    g.fillArc(ark.getX(),ark.getY(), ark.getWidth() ,ark.getHeight(), ark.getStartAngle(), ark.getArkAngle());
                    continue;
                case 4:
                    Ark roundRect=new Ark(getX(),getY());
                    g.setColor(roundRect.getColor());
                    g.fillRoundRect(roundRect.getX(),roundRect.getY(), roundRect.getWidth() ,roundRect.getHeight(), roundRect.getStartAngle(), roundRect.getArkAngle());
                    continue;
                case 5:
                    Rect circle=new Rect(getX(),getY());
                    g.setColor(circle.getColor());
                    g.fillOval(circle.getX(),circle.getY(),circle.getWidth(), circle.getHeight());
                    g.fillRect(circle.getX(),circle.getY()+1,circle.getWidth()-1, circle.getHeight()-circle.getHeight()-10);
                    continue;
                case 6:
                    Rect line=new Rect(getX(),getY());
                    g.setColor(line.getColor());
                    int startX=0;
                    int startY=0;
                    int endX=0;
                    int endY=0;
                    int point=randomPoint();
                    for (int i=0;i<=point;i++)
                    {
                        if (i==0)
                        {
                            endX=random(line.getX());
                            endY=random(line.getY());
                            g.drawLine(line.getX(),line.getY(),endX,endY);
                            startX=endX;
                            startY=endY;
                        }
                        else if (i!=point)
                        {
                            endX=random(startX);
                            endY=random(startY);
                            g.drawLine(startX,startY,endX,endY);
                        }
                        else
                            g.drawLine( endX, endY,line.getX(),line.getY());
                    }
            }
        }
    }
}