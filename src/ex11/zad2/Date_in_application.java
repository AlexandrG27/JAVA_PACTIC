package ex11.zad2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

//2
    public class Date_in_application extends JFrame {
    Calendar calendar = new GregorianCalendar();
    SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
    String dateToday = formattedDate.format(calendar.getTime());
    JPanel pan = new JPanel(null);
    JLabel label;
    JFrame frame = new JFrame();
    public Date_in_application() {
        super("Date");
        this.setBounds(100, 100, 300, 400); // размер окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel(dateToday);
        pan.add(label);
        //frame.add()


    }

    class result implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            }
        }
    }
