package Practice_16X;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;
public class Form1 extends JFrame
{
    public JTextField jta1 = new JTextField("");
    public JButton button = new JButton("Ввод");
    int rand;
    int count=3;
    Form1()
    {
        super("Задание 16-1");
        super.setBounds(125, 150, 380, 330);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setBackground(Color.WHITE);
        super.setLayout(new BorderLayout());
        Random random=new Random();
        rand=random.nextInt(0,20);
        System.out.println(rand);
        JPanel panel =new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setLayout(new FlowLayout());
        JPanel panel2 =new JPanel();
        panel2.setBackground(Color.RED);
        panel2.setLayout(new FlowLayout());
        JPanel panel3 =new JPanel();
        panel3.setBackground(Color.PINK);
        panel3.setLayout(new FlowLayout());
        JPanel panel4 =new JPanel();
        panel4.setBackground(Color.BLACK);
        panel4.setLayout(new FlowLayout());
        JPanel panel5 =new JPanel();
        panel5.setBackground(Color.YELLOW);
        panel5.setLayout(new GridLayout(3,1,50,10));
        panel.add(new JLabel("North"));
        panel2.add(new JLabel("East"));
        panel3.add(new JLabel("West"));
        panel4.add(new JLabel("South"));
        JLabel label=new JLabel("Center");
        panel5.add(label);
        panel5.add(jta1);
        panel5.add(button);
        panel.setPreferredSize(new Dimension(100,60));
        panel2.setPreferredSize(new Dimension(100,60));
        panel3.setPreferredSize(new Dimension(100,60));
        panel4.setPreferredSize(new Dimension(100,60));
        panel5.setPreferredSize(new Dimension(100,60));
        panel.addMouseMotionListener(new MouseMotionListener()
        {
            @Override
            public void mouseDragged(MouseEvent e) { }
            @Override
            public void mouseMoved(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО" , "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel2.addMouseMotionListener(new MouseMotionListener()
        {
            @Override
            public void mouseDragged(MouseEvent e) { }
            @Override
            public void mouseMoved(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО" , "Alert", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        panel3.addMouseMotionListener(new MouseMotionListener()
        {
            @Override
            public void mouseDragged(MouseEvent e) { }
            @Override
            public void mouseMoved(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО" , "Alert", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        panel4.addMouseMotionListener(new MouseMotionListener()
        {
            @Override
            public void mouseDragged(MouseEvent e) { }
            @Override
            public void mouseMoved(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО" , "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel5.addMouseMotionListener(new MouseMotionListener()
        {
            @Override
            public void mouseDragged(MouseEvent e) { }
            @Override
            public void mouseMoved(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО" , "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (jta1.getText().equals(Integer.toString(rand)))
                {
                    JOptionPane.showMessageDialog(null, "Поздравляю вы выиграли!!!" , "Alert", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else
                {
                    if (rand>Integer.parseInt(jta1.getText()))
                    {
                        count--;
                        JOptionPane.showMessageDialog(null, "Загаданное число больше. Осталось попыток:"+count , "Alert", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        count--;
                        JOptionPane.showMessageDialog(null, "Загаданное число меньше. Осталось попыток:"+count , "Alert", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                jta1.setText("");
                if(count==0)
                {
                    JOptionPane.showMessageDialog(null, "Увы, вы проиграли(((" , "Alert", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
        });
        super.add(panel, BorderLayout.NORTH);
        super.add(panel2, BorderLayout.EAST);
        super.add(panel3, BorderLayout.WEST);
        super.add(panel4, BorderLayout.SOUTH);
        super.add(panel5, BorderLayout.CENTER);
    }
}
