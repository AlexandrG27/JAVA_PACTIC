package Practice_15X;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class Form3 extends JFrame
{
    public JTextField jta1 = new JTextField();
    public JMenuBar jMenuBar;
    public Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    public ImageIcon img= new ImageIcon("src/cat/cat (1).jpg");
    Form3()
    {
        super("Задание 15-3");
        super.setBounds(700, 250, 300, 150);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        JButton but1 = new JButton("Button1");
        JButton but2 = new JButton("Очистить");
        but1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jta1.setText("(ノ°益°)ノ");
            }
        });
        but2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jta1.setText("");
            }
        });
        but1.setBounds(50,10,90,22);
        but2.setBounds(150,10,90,22);
        jta1.setBounds(50,40,192,22);
        jMenuBar=new JMenuBar();
        JMenu file=new JMenu("Файл");
        JMenu help=new JMenu("Справка");
        JLabel text=new JLabel(img);
        help.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, text , "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });
        file.add(new JMenuItem("Сохранить")).addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                File file=new File("src/ru/mirea/lab1/Homework15/Save");
                try
                {
                    PrintWriter pw=new PrintWriter(file);
                    pw.println(jta1.getText());
                    pw.close();
                } catch (FileNotFoundException e1)
                {
                    throw new RuntimeException(e1);
                }
            }
        });
        JMenu option = new JMenu("Правка");
        file.add(option);
        option.add("Копировать").addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                StringSelection stringSelection = new StringSelection(jta1.getText());
                clipboard.setContents(stringSelection, null);
            }
        });
        option.add("Вырезать").addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                StringSelection stringSelection = new StringSelection(jta1.getText());
                clipboard.setContents(stringSelection, null);
                jta1.setText("");
            }
        });
        option.add("Вставить").addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                DataFlavor flavor=DataFlavor.stringFlavor;
                try
                {
                    jta1.setText((String) clipboard.getData(flavor));
                }
                catch (UnsupportedFlavorException ex)
                {
                    throw new RuntimeException(ex);
                }
                catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
            }
        });
        file.addSeparator();
        file.add(new JMenuItem("Выйти")).addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        jMenuBar.add(file);
        jMenuBar.add(help);
        jta1.setPreferredSize(new Dimension(100,80));
        super.setJMenuBar(jMenuBar);
        super.add(but1);
        super.add(but2);
        super.add(jta1);
        super.revalidate();
    }
}