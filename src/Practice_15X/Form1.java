package Practice_15X;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Form1 extends JFrame
{
    public static JTextField jta1 = new JTextField();
    public static JTextField jta2 = new JTextField();
    public Form1()
    {
        super("Задание 15-1");
        super.setBounds(50, 250, 380, 200);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setLayout(new BorderLayout());
        setLayout(null);
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(15, 15));
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.RED);
        JLabel name = new JLabel("1st Number");
        JLabel name2 = new JLabel("2st Number");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mult = new JButton("*");
        JButton div = new JButton("/");
        name.setBounds(80, 10, 100, 50);
        name2.setBounds(80, 40, 100, 50);
        jta1.setBounds(170, 27, 100, 20);
        jta2.setBounds(170, 55, 100, 20);
        plus.setBounds(60, 90, 50, 20);
        minus.setBounds(120, 90, 50, 20);
        mult.setBounds(180, 90, 50, 20);
        div.setBounds(240, 90, 50, 20);
        super.add(name);
        super.add(name2);
        super.add(jta1);
        super.add(jta2);
        super.add(plus);
        super.add(minus);
        super.add(mult);
        super.add(div);
        plus.addActionListener(new ButtonPlus());
        minus.addActionListener(new ButtonMinus());
        mult.addActionListener(new ButtonMult());
        div.addActionListener(new ButtonDiv());
    }
    public static class ButtonPlus implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception e1)
            {
                JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private class ButtonMinus implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception e1)
            {
                JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private class ButtonMult implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Error in Numbers !", "Alert", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private class ButtonDiv implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception e1)
            {
                JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
