package Practice_22X;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Form extends JFrame
{
    public static JTextField jtf=new JTextField("");
    Form ()
    {
        super("Задание 22-2");
        super.setBounds(550, 250, 280, 330);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setBackground(Color.WHITE);
        super.setLayout(new BorderLayout(0,5));
        jtf.setBackground(Color.WHITE);
        jtf.setEditable(false);
        JPanel panel = new JPanel();
        panel.setLayout( new GridLayout(4,4,2,2));
        JButton but7=new JButton("7");
        but7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"7");
            }
        });
        panel.add(but7);
        JButton but8=new JButton("8");
        but8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"8");
            }
        });
        panel.add(but8);
        JButton but9=new JButton("9");
        but9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"9");
            }
        });
        panel.add(but9);
        JButton butDev=new JButton("/");
        butDev.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"/");
            }
        });
        panel.add(butDev);
        JButton but4=new JButton("4");
        but4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"4");
            }
        });
        panel.add(but4);
        JButton but5=new JButton("5");
        but5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"5");
            }
        });
        panel.add(but5);
        JButton but6=new JButton("6");
        but6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"6");
            }
        });
        panel.add(but6);
        JButton butMult=new JButton("*");
        butMult.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"*");
            }
        });
        panel.add(butMult);
        JButton but1=new JButton("1");
        but1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"1");
            }
        });
        panel.add(but1);
        JButton but2=new JButton("2");
        but2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"2");
            }
        });
        panel.add(but2);
        JButton but3=new JButton("3");
        but3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"3");
            }
        });
        panel.add(but3);
        JButton butPlus=new JButton("+");
        butPlus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"+");
            }
        });
        panel.add(butPlus);
        JButton butClear=new JButton("C");
        butClear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(" ");
            }
        });
        panel.add(butClear);
        JButton but0=new JButton("0");
        but0.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"0");
            }
        });
        panel.add(but0);
        JButton butEq=new JButton("=");
        butEq.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                SimpleStack stack=new SimpleStack();
                JOptionPane.showMessageDialog(null, String.valueOf(Main.stack(jtf.getText())) , "Ответ", JOptionPane.INFORMATION_MESSAGE);
                jtf.setText("");
            }
        });
        panel.add(butEq);
        JButton butMinus=new JButton("-");
        butMinus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setText(jtf.getText()+"-");
            }
        });
        panel.add(butMinus);
        jtf.setPreferredSize(new Dimension(100,60));
        super.add(jtf, BorderLayout.NORTH);
        super.add(panel, BorderLayout.CENTER);
    }
}
