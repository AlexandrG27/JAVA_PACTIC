package Practice_5X.Homework5_4;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
public class Form extends JComponent
{
    public int  i=1;
    public void paint(Graphics g)
    {
        if (i == 64)
            i = 1;
        g.drawImage(new ImageIcon("src/cat/cat (" + Integer.toString(i) + ").jpg").getImage(), 0, 0, null);
        i++;
        try {
            TimeUnit.MILLISECONDS.sleep(80);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();
    }
}