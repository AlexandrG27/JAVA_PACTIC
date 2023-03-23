package Practice_16X;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
public class Form3 extends JFrame
{
    String Password="12345";
    Form3()
    {
        super("Задание 16-3");
        super.setBounds(925, 150, 280, 150);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setBackground(Color.WHITE);
        super.setLayout(new BorderLayout());
        super.setResizable(false);
        setLayout(null);
        JLabel service = new JLabel("Service:");
        service.setBounds(43,10,50,20);
        JLabel pas = new JLabel("Username:");
        pas.setBounds(32,35,60,20);
        JLabel user = new JLabel("Password:");
        user.setBounds(30,60,65,20);
        JLabel notif = new JLabel("");
        notif.setBounds(80,80,200,20);
        JTextField jtx1 = new JTextField();
        jtx1.setBounds(100,10,150,20);
        JTextField jtx2 = new JTextField();
        jtx2.setBounds(100,35,150,20);
        JTextField jtx3 = new JTextField();
        jtx3.setBounds(100,60,150,20);
        jtx3.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e)
            {
                if (!jtx3.getText().equals(Password))
                {
                    notif.setForeground(Color.RED);
                    notif.setText("Пароль введен не верно!");

                }
                else
                {
                    notif.setForeground(Color.GREEN);
                    notif.setText("Пароль верный!");
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) { }
            @Override
            public void changedUpdate(DocumentEvent e) { }
        });
        super.add(service);
        super.add(pas);
        super.add(user);
        super.add(notif);
        super.add(jtx1);
        super.add(jtx2);
        super.add(jtx3);
    }
}
