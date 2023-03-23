package Practice_6X.Homework6_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.awt.BorderLayout.CENTER;
public class main extends JFrame
{
    public static JFrame frame = new JFrame("My Snake");
    public static JLabel labScore;
    public static JLabel background;
    public static MyFrame myFrame;
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("src/animation/background.jpg");
        ImageIcon bestResult = new ImageIcon("src/animation/BestResult.png");
        background=new JLabel(img);
        background.setSize(480,480);
        frame.setBounds(300,100,480,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        JButton butStart=new JButton("START");
        butStart.setBounds(130,290,200,100);
        String line="";
        JLabel labHeightScore = new JLabel("HIGHEST SCORE "+line);
        Font font = new Font("Verdana", Font.PLAIN, 22);
        labHeightScore.setForeground(Color.WHITE);
        labHeightScore.setBounds(140,20,300,50);
        System.out.println(Body.getCountBody());
        score();
        labHeightScore.setFont(font);
        background.add(butStart);
        background.add(labHeightScore);
        frame.add(background);
        butStart.addActionListener(new Start());
        frame.setVisible(true);
    }
    public static void score()
    {
        if (Body.getCountBody()!=0)
        {
            labScore = new JLabel("score "+(-10+Body.getCountBody()*10));
            labScore.setForeground(Color.WHITE);
            labScore.setBounds(170,100,200,50);
            Font font2 = new Font("Verdana", Font.PLAIN, 22);
            labScore.setFont(font2);
            background.add(labScore);
        }
    }
    public static void deleteScore()
    {
        if (Body.getCountBody()!=0)
        {
            background.remove(labScore);
        }
    }
}
class Start implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        main.frame.setVisible(false);
        main.deleteScore();
        Body.countBody=0;
        main.myFrame = new MyFrame();
    }
}
