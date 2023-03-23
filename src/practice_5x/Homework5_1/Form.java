package Practice_5X.Homework5_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Form extends JFrame
{
    JLabel name, name2, name3;
    public int scoreMilan=0;
    public int scoreMadrid=0;
    public Form()
    {
        super("Практическая 1");
        super.setBounds(550,250,450,200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        super.setResizable(false);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel1.setLayout( new FlowLayout(FlowLayout.CENTER, 10,30));
        panel2.setLayout( new GridLayout(1,3,4,4));
        name = new JLabel("Result: 0 X 0");
        name2 = new JLabel("Last Scorer: N/A");
        name3 = new JLabel("Winner: DRAW");
        JButton but1 = new JButton("AC Milan");
        JButton but2 = new JButton("Real Madrid");
        panel1.add(but1);
        panel1.add(but2);
        panel2.add(name);
        panel2.add(name2);
        panel2.add(name3);
        panel1.setBackground(new Color(70, 50, 170, 0));
        but1.setBackground(Color.green);
        but2.setBackground(Color.YELLOW);
        super.add(panel1, BorderLayout.NORTH);
        super.add(panel2, BorderLayout.CENTER);
        but1.addActionListener(new ButtonMilan());
        but2.addActionListener(new ButtonMadrid());
    }
    public void winner()
    {
        if (scoreMadrid>scoreMilan)
            name3.setText("Winner: Madrid");
        else if (scoreMadrid<scoreMilan)
            name3.setText("Winner: Milan");
        else
            name3.setText("Winner: Draw");
    }
    class ButtonMilan implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            scoreMilan+=1;
            name.setText("Result: "+Integer.toString(scoreMilan)+ " X "+ Integer.toString(scoreMadrid));
            name2.setText("Last Scorer: Milan");
            winner();
        }
    }
    class ButtonMadrid implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            scoreMadrid+=1;
            name.setText("Result: "+Integer.toString(scoreMilan)+ " X "+ Integer.toString(scoreMadrid));
            name2.setText("Last Scorer: Madrid");
            winner();
        }
    }
}
