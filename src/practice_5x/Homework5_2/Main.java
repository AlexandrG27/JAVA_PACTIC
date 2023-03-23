package Practice_5X.Homework5_2;
import javax.swing.*;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(400, 50);
        f.setSize(960, 500);
        ContactForm form = new ContactForm();
        f.setVisible(true);
        f.add(form);
    }
    public static int setRandom()
    {
        Random random = new Random();
        return random.nextInt(12);
    }
}