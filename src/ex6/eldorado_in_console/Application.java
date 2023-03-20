package ex6.eldorado_in_console;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
public class Application extends JPanel
{
    public static String count228;
    public static void Set () {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JFrame jfrm = new JFrame("Eldorado");
        jfrm.setSize(500, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

        JButton button1 = new JButton("Добавить");
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);
        JButton button2 = new JButton("Найти");
        button2.setBackground(Color.GREEN);
        button2.setForeground(Color.WHITE);
        JButton button3 = new JButton("Удалить");
        button3.setBackground(Color.RED);
        button3.setForeground(Color.WHITE);
        JButton button4 = new JButton("База данных");
        button4.setBackground(Color.MAGENTA);
        button4.setForeground(Color.WHITE);

        jfrm.add(button1, BorderLayout.WEST);
        jfrm.add(button2, BorderLayout.NORTH);
        jfrm.add(button3, BorderLayout.EAST);
        jfrm.add(button4, BorderLayout.CENTER);

        jfrm.setLocationRelativeTo(null);
        jfrm.setVisible(true);

        MouseListener mouseListener = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                    String Brand = "", cpu = "", Monitor = "", Memory = "", count228 = "";
                    Brand = JOptionPane.showInputDialog("Введите марку компьютера");
                    cpu = JOptionPane.showInputDialog("Введите покление процессора Intel core");
                    Monitor = JOptionPane.showInputDialog("Введите диагональ монитора (в дюймах)");
                    Memory = JOptionPane.showInputDialog("Введите память компьютера (в Гб)");
                    count228 = JOptionPane.showInputDialog("Введите номер компьютера");
                    String comp, comp1;
                    comp1 = count228 + " " + "Компьютер: " + Brand + " Поколение процессора Intel core: " + cpu + " Монитор: " + Monitor + "/Inch" + " Память: " + Memory + "/Gb";
                    comp = "Характеристики компьютера " + Brand + ":" + "\n" + "\n" + cpu + "\n" + Monitor + "\n" + Memory + "\n" + "\n" + "    Компьютер добавлен!";
                    JOptionPane.showMessageDialog(null, comp);
                    Shop.AddPc(comp1);
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        button1.addMouseListener(mouseListener);

        MouseListener mouseListener2 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                String comp;
                comp = JOptionPane.showInputDialog("Введите номер компьютера");
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(new File("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt"));
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                byte[] content = new byte[0];
                try {
                    content = new byte[fis.available()];
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.read(content);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                String[] lines = new String(content).split("\n");
                for (String line : lines){
                    String[] words = line.split(" ");
                    for (String word : words)
                    {
                        if (word.equalsIgnoreCase(comp))
                        {
                            JOptionPane.showMessageDialog(null, words);
                            Shop.count=true;
                            break;
                        }

                    }

                }

                if(Shop.count == false)
                {
                    String warning = "Не найдено в базе!";
                    JOptionPane.showMessageDialog(null, warning);
                }
                Shop.count=false;
                System.out.println("\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        button2.addMouseListener(mouseListener2);

        MouseListener mouseListener3 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                String comp = "";
                String cpu = "";
                String monitor = "";
                String memory = "";
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(new File("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt"));
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                byte[] content = new byte[0];
                try {
                    content = new byte[fis.available()];
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.read(content);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                String[] lines = new String(content).split("\n");
                for (String line : lines){
                    String[] words = line.split(" ");
                    for (String word : words)
                    {
                        Shop.count=true;
                    }
                }
                JOptionPane.showMessageDialog(null, lines);
                count228 = JOptionPane.showInputDialog("Введите номер компьютера");
                try {
                    JOptionPane.showMessageDialog(null, Shop.DeletePc(count228) + "Компьютер удалён из базы");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        button3.addMouseListener(mouseListener3);

        MouseListener mouseListener4 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                String comp = "";
                String cpu = "";
                String monitor = "";
                String memory = "";
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(new File("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt"));
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                byte[] content = new byte[0];
                try {
                    content = new byte[fis.available()];
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.read(content);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                String[] lines = new String(content).split("\n");
                for (String line : lines){
                    String[] words = line.split(" ");
                    for (String word : words)
                    {
                    }
                }
                JOptionPane.showMessageDialog(null, lines);

            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        button4.addMouseListener(mouseListener4);
    }

    public static void main(String[] args)
    {

        Set();
    }
}