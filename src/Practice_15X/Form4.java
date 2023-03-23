package Practice_15X;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Form4 extends JFrame
{
    public JTextField jta1 = new JTextField("");
    public JTextField jta2 = new JTextField("");
    public boolean plus=false;
    public boolean minus=false;
    public boolean div=false;
    public boolean mult=false;
    public boolean TextF=false;
    double x=0;
    double y=0;
    Form4()
    {
        super("Задание 15-4");
        super.setBounds(1050, 250, 280, 330);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setBackground(Color.WHITE);
        super.setLayout(new BorderLayout(0,10));
        jta1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jta2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jta1.setBorder(BorderFactory.createLineBorder(Color.white));
        jta2.setBorder(BorderFactory.createLineBorder(Color.white));
        jta1.setFont(jta1.getFont().deriveFont(24f));
        jta1.setEditable(false);
        jta2.setEditable(false);
        jta1.setBackground(Color.WHITE);
        jta2.setBackground(Color.WHITE);
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10,5,10,5));
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout(-1,-1));
        setBackground(Color.WHITE);
        panel.setLayout( new GridLayout(4,4,5,5));
        JButton but1=new JButton("7");
        but1.setBackground(Color.WHITE);
        but1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"7");
                else
                {
                    jta1.setText("7");
                    TextF=false;
                }
            }
        });
        JButton but2=new JButton("8");
        but2.setBackground(Color.WHITE);
        but2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"8");
                else
                {
                    jta1.setText("8");
                    TextF=false;
                }
            }
        });
        JButton but3=new JButton("9");
        but3.setBackground(Color.WHITE);
        but3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"9");
                else
                {
                    jta1.setText("9");
                    TextF=false;
                }
            }
        });
        JButton but4=new JButton("/");
        but4.setBackground(Color.lightGray);
        but4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jta2.setText(jta1.getText());
                jta2.setText("/"+jta1.getText());
                checkDecide();
                div=true;
                TextF=true;
                x=Double.parseDouble(jta1.getText());
            }
        });
        JButton but5=new JButton("4");
        but5.setBackground(Color.WHITE);
        but5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"4");
                else
                {
                    jta1.setText("4");
                    TextF=false;
                }
            }
        });
        JButton but6=new JButton("5");
        but6.setBackground(Color.WHITE);
        but6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"5");
                else
                {
                    jta1.setText("5");
                    TextF=false;
                }
            }
        });
        JButton but7=new JButton("6");
        but7.setBackground(Color.WHITE);
        but7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"6");
                else
                {
                    jta1.setText("6");
                    TextF=false;
                }
            }
        });
        JButton but8=new JButton("*");
        but8.setBackground(Color.lightGray);
        but8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jta2.setText(jta1.getText());
                jta2.setText("*"+jta1.getText());
                checkDecide();
                TextF=true;
                mult=true;
                x=Double.parseDouble(jta1.getText());

            }
        });
        JButton but9=new JButton("1");
        but9.setBackground(Color.WHITE);
        but9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"1");
                else
                {
                    jta1.setText("1");
                    TextF=false;
                }
            }
        });
        JButton but10=new JButton("2");
        but10.setBackground(Color.WHITE);
        but10.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"2");
                else
                {
                    jta1.setText("2");
                    TextF=false;
                }
            }
        });
        JButton but11=new JButton("3");
        but11.setBackground(Color.WHITE);
        but11.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"3");
                else
                {
                    jta1.setText("3");
                    TextF=false;
                }
            }
        });
        JButton but12=new JButton("-");
        but12.setBackground(Color.lightGray);
        but12.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jta2.setText(jta1.getText());
                jta2.setText("-"+jta1.getText());
                checkDecide();
                TextF=true;
                minus=true;
                x=Double.parseDouble(jta1.getText());
            }
        });
        JButton but13=new JButton(".");
        but13.setBackground(Color.WHITE);
        but13.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+".");
                else
                {
                    jta1.setText("0.");
                    TextF=false;
                }
            }
        });
        JButton but14=new JButton("0");
        but14.setBackground(Color.WHITE);
        but14.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!TextF)
                    jta1.setText(jta1.getText()+"0");
                else
                {
                    jta1.setText("0");
                    TextF=false;
                }
            }
        });
        JButton but15=new JButton("=");
        but15.setBackground(Color.LIGHT_GRAY);
        but15.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                y=Double.parseDouble(jta1.getText());
                decide();
            }
        });
        JButton but16=new JButton("+");
        but16.setBackground(Color.lightGray);
        but16.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jta2.setText(jta1.getText());
                jta2.setText("+"+jta1.getText());
                checkDecide();
                TextF=true;
                plus=true;
                x=Double.parseDouble(jta1.getText());
            }
        });

        JButton but17=new JButton("С");
        but17.setBackground(Color.WHITE);
        but17.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jta2.setText("");
                jta1.setText("");
                TextF=false;
            }
        });
        panel.add(but1);
        panel.add(but2);
        panel.add(but3);
        panel.add(but4);
        panel.add(but5);
        panel.add(but6);
        panel.add(but7);
        panel.add(but8);
        panel.add(but9);
        panel.add(but10);
        panel.add(but11);
        panel.add(but12);
        panel.add(but13);
        panel.add(but14);
        panel.add(but17);
        panel.add(but16);
        jta2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel2.add(jta2, BorderLayout.NORTH);
        panel2.add(jta1,BorderLayout.CENTER);
        panel2.setPreferredSize(new Dimension(100,70));
        but15.setPreferredSize(new Dimension(100,30));
        super.add(panel2, BorderLayout.NORTH);
        super.add(but15,BorderLayout.SOUTH);
        super.add(panel);
    }
    private void checkDecide()
    {
        if (!TextF)
        {
            y=Double.parseDouble(jta1.getText());
            if (plus)
            {
                jta2.setText(String.valueOf(x+y));
                jta1.setText(String.valueOf(x+y));
                plus=false;
            }
            if (minus)
            {
                jta2.setText(String.valueOf(x-y));
                jta1.setText(String.valueOf(x-y));
                minus=false;
            }
            if (div)
            {
                jta2.setText(String.valueOf(x/y));
                jta1.setText(String.valueOf(x/y));
                div=false;
            }
            if (mult)
            {
                jta2.setText(String.valueOf(x*y));
                jta1.setText(String.valueOf(x*y));
                mult=false;
            }
            TextF=true;
        }
    }
    private void decide()
    {
        if (plus)
        {
            jta1.setText(String.valueOf(x+y));
            plus=false;
        }
        if (minus)
        {
            jta1.setText(String.valueOf(x-y));
            minus=false;
        }
        if (div)
        {
            jta1.setText(String.valueOf(x/y));
            div=false;
        }
        if (mult)
        {
            jta1.setText(String.valueOf(x*y));
            mult=false;
        }
        TextF=true;
    }
}