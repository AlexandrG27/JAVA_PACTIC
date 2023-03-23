package Practice_5X.Homework5_3;
import javax.swing.*;
import java.awt.*;
public class main
{
    public static void main(String args[])
    {
        String[] strings = new String[1];
        strings[0] = "C:\\Users\\user\\Downloads\\cat.jpg";
        Image bgImage= Toolkit.getDefaultToolkit().getImage(strings[0]);
        JLabel jLabel = new JLabel(new ImageIcon(bgImage));
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.GRAY);
        mainPanel.add(jLabel);
        JFrame frame = new JFrame("JFrame");
        frame.setPreferredSize(new Dimension(800,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}