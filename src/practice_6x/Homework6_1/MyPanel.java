package Practice_6X.Homework6_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
public class MyPanel extends JPanel implements ActionListener
{
    public static Timer timer;
    Image enemy;
    ImageIcon Background = new ImageIcon("src/animation/background.jpg");
    ImageIcon LeftHead = new ImageIcon("src/animation/LeftHead.png");
    ImageIcon RightHead = new ImageIcon("src/animation/RightHead.png");
    ImageIcon TopHead = new ImageIcon("src/animation/TopHead.png");
    ImageIcon DownHead = new ImageIcon("src/animation/DownHead.png");
    ImageIcon BodyShake = new ImageIcon("src/animation/BodyBlue.png");
    ImageIcon EatSnake = new ImageIcon("src/animation/Eat.png");
    ImageIcon EatApple = new ImageIcon("src/animation/EatApple.png");
    Eat eat=new Eat();
    int xVelocity=1;
    int yVelocity=1;
    int x=250;
    int y=250;

    int delay=20;
    int xLastBody;
    int yLastBody;
    int countBody=1;
    int randomEat;
    public static List<Body> body=new ArrayList<>();
    MovablePoint MovablePoint;
    MyPanel(MovablePoint MovablePoint)
    {
        this.MovablePoint = MovablePoint;
        this.setPreferredSize(new Dimension(480,480));
        //this.setBackground(Color.DARK_GRAY);
        timer = new Timer(15,this);
        timer.start();
    }
    public void paint (Graphics g)
    {
        super.paint(g);
        g.drawImage(Background.getImage(),0,0,480,480,null);
        g.setColor(Color.WHITE);
        g.drawString("score "+(-10+Body.getCountBody()*10),10,10);
        Graphics2D g2d=(Graphics2D) g;
        Random rand=new Random();
        if(!Eat.isaBoolean())
        {
            randomEat=rand.nextInt(1,3);
            Eat.setBoolean(true);
        }
        switch (randomEat)
        {
            case 1:
                g.drawImage(EatSnake.getImage(),Eat.getX(),Eat.getY(),30,30,null);
                break;

            case 2:
                g.drawImage(EatApple.getImage(),Eat.getX(),Eat.getY(),30,30,null);
        }
        body=Snake.getListSnake();
        if(Body.getCountBody()==0)
        {
            Body.setCountBody(1);
            Snake.setList(new Body(x,y,0,"L"));
        }
        for(int i =0; i<body.size();i++)
        {
            if (i==0)
            {
                if(Snake.getHeadBody().getLastCommand().equals("L"))
                    g.drawImage(LeftHead.getImage(),body.get(i).getX(),body.get(i).getY(),30,30,null);
                if(Snake.getHeadBody().getLastCommand().equals("R"))
                    g.drawImage(RightHead.getImage(),body.get(i).getX(),body.get(i).getY(),30,30,null);
                if(Snake.getHeadBody().getLastCommand().equals("U"))
                    g.drawImage(TopHead.getImage(),body.get(i).getX(),body.get(i).getY(),30,30,null);
                if(Snake.getHeadBody().getLastCommand().equals("D"))
                    g.drawImage(DownHead.getImage(),body.get(i).getX(),body.get(i).getY(),30,30,null);
            }
            else
            {
                g.drawImage(BodyShake.getImage(),body.get(i).getX(),body.get(i).getY(),30,30,null);
            }
        }
        x=Snake.xHead();
        y=Snake.yHead();
        xLastBody= body.get(body.size()-1).getX();
        yLastBody= body.get(body.size()-1).getY();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Snake.move();
        if(((Eat.getX()-15<x)&&(Eat.getX()+15>x))&&((Eat.getY()-15<y)&&(Eat.getY()+15>y)))
        {
            Body.setCountBody(1);
            if (Snake.getLastBody().getLastCommand()=="R")
            {
                Snake.setList(new Body(xLastBody-30,yLastBody,Snake.getLastBody().getIndex(),Snake.getLastBody().getLastCommand()));
            }
            if(Snake.getLastBody().getLastCommand()=="L")
            {
                Snake.setList(new Body(xLastBody+30,yLastBody,Snake.getLastBody().getIndex(),Snake.getLastBody().getLastCommand()));
            }
            if(Snake.getLastBody().getLastCommand()=="D")
            {
                Snake.setList(new Body(xLastBody,yLastBody-30,Snake.getLastBody().getIndex(),Snake.getLastBody().getLastCommand()));
            }
            if(Snake.getLastBody().getLastCommand()=="U")
            {
                Snake.setList(new Body(xLastBody,yLastBody+30,Snake.getLastBody().getIndex(),Snake.getLastBody().getLastCommand()));
            }
            Eat.setBoolean(false);
            Eat.setXY();
        }
        repaint();
    }
    public int random()
    {
        Random random=new Random();
        return random.nextInt(500);
    }
}
