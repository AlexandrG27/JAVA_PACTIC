package Practice_16X;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Form2 extends JFrame
{
    public JMenuBar jMenuBar;
    Form2()
    {
        super("Задание 16-2");
        super.setBounds(525, 150, 380, 330);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setBackground(Color.WHITE);
        super.setLayout(new BorderLayout());
        JTextArea area=new JTextArea(100,100);
        area.setLineWrap(true);
        jMenuBar=new JMenuBar();
        JMenu file=new JMenu("Настройки");
        JMenu font = new JMenu("Шрифт");
        file.add(font);
        JMenu color = new JMenu("Цвет");
        file.add(color);
        font.add("Times New Roman").addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Font font1 = new Font("Times New Roman",Font.PLAIN,14);
                area.setFont(font1);
            }
        });
        font.add("MS Sans Serif").addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Font font1 = new Font("MS Sans Serif",Font.PLAIN,14);
                area.setFont(font1);
            }
        });
        font.add("Courier New").addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font1 = new Font("Courier New",Font.PLAIN,14);
                area.setFont(font1);

            }
        });
        color.add("Синий").addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                area.setForeground(Color.BLUE);
            }
        });
        color.add("Красный").addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                area.setForeground(Color.RED);
            }
        });
        color.add("Черный").addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                area.setForeground(Color.BLACK);
            }
        });
        jMenuBar.add(file);
        super.add(area, BorderLayout.CENTER);
        super.setJMenuBar(jMenuBar);
        super.revalidate();
    }
}
