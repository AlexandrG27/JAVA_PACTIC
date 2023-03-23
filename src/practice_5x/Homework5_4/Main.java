package Practice_5X.Homework5_4;
import javax.swing.*;
public class Main
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Котэ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(500, 100);
        f.setSize(230, 255);
        Form form = new Form();
        f.add(form);
        f.setVisible(true);
    }
}
