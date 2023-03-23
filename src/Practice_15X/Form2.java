package Practice_15X;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class Form2 extends JFrame
{
    public JComboBox comboBox;
    public JLabel name;
    Form2()
    {
        super("Задание 15-2");
        super.setBounds(470, 250, 200, 100);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setLayout(new BorderLayout());
        String[] country = {"Russia", "China", "England", "Australia"};
        comboBox=new JComboBox<>(country);
        name = new JLabel();
        super.add(comboBox,BorderLayout.NORTH);
        super.add(name,BorderLayout.CENTER);
        comboBox.addActionListener(new Act());
    }
    private class Act implements java.awt.event.ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {

            switch (comboBox.getSelectedIndex())
            {
                case 0:
                    name.setText("Население: 146 171 015 чел.");
                    break;
                case 1:
                    name.setText("Население: 1 410 539 758 чел.");
                    break;
                case 2:
                    name.setText("Население: 67 081 000 чел.");
                    break;

                case 3:
                    name.setText("Население: 27 937 296 чел.");
            }
        }
    }
}