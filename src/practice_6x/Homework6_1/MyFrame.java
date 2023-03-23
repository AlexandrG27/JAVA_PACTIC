package Practice_6X.Homework6_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.BorderLayout.CENTER;
public class MyFrame extends JFrame implements KeyListener
{
    public static MyPanel panel;
    public static MovablePoint MovablePoint =new MovablePoint();
    MyFrame()
    {
        panel=new MyPanel(MovablePoint);
        addKeyListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocation(300,100);
        this.setVisible(true);
    }
    public void exit()
    {
        dispose();
    }
    @Override
    public void keyTyped(KeyEvent e)
    {
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            if (Snake.getHeadBody().getLastCommand()!="L")
            {
                MovablePoint.moveRight();

            }
        }
        if (e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            if (Snake.getHeadBody().getLastCommand()!="R")
            {
                MovablePoint.moveLeft();
            }
        }
        if (e.getKeyCode()==KeyEvent.VK_UP)
        {
            if (Snake.getHeadBody().getLastCommand()!="D")
            {
                MovablePoint.moveUp();
            }
        }
        if (e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            if (Snake.getHeadBody().getLastCommand()!="U")
            {
                MovablePoint.moveDown();
            }

        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
