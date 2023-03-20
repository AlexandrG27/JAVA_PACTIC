package ru.mirea.task30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame  {

    public static JTextField jta1 = new JTextField("");
    public static JTextField jta2 = new JTextField("");
    public static JTextField jta3 = new JTextField("");

    public static JTextField jta21 = new JTextField("");
    public static JTextField jta22 = new JTextField("");
    public static JTextField jta23 = new JTextField("");
    public static JPanel panelGrid = new JPanel();
    public static JPanel panelGrid2 = new JPanel();
    Form()
    {
        super("Задание 30");
        super.setBounds(525, 150, 500, 430);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setBackground(Color.WHITE);
        super.setLayout(new GridLayout(0,2,0,0));

        JPanel panelLeft=new JPanel();
        panelLeft.setBackground(new Color(116, 132, 132));


        JPanel panelRight=new JPanel();
        panelRight.setBackground(new Color(116, 132, 132));
        panelRight.setLayout(null);

        panelLeft.setLayout(null);

        Font font = new Font("Verdana", Font.PLAIN, 14);

        panelGrid.setLayout(new GridLayout(15,0,4,4));
        panelGrid2.setLayout(new GridLayout(15,0,4,4));

        panelGrid2.setBounds(5+5,160+40,230,350);
        panelGrid2.setBackground(Color.LIGHT_GRAY);

        panelGrid.setBounds(5,120+40,230,350);
        panelGrid.setBackground(Color.LIGHT_GRAY);

        JButton add = new JButton("add");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if((!jta1.getText().equals(""))&&(!jta2.getText().equals("")))
                    main.internetOrder.add(new Drink(Integer.parseInt(jta2.getText()), jta1.getText(), jta3.getText()));
                refresh();

            }
        });
        add.setBounds(5,75+40,70,30);

        JButton delete = new JButton("delete");
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main.internetOrder.remove(jta1.getText());
                refresh();
            }
        });
        delete.setBounds(83,75+40,70,30);

        JButton remove = new JButton("sort");

        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuItem[] menuItem = main.internetOrder.sortedItemsByCostDesc();
                refresh(menuItem);
            }
        });
        remove.setBounds(160,75+40,70,30);

        JLabel name = new JLabel("Название ");

        name.setBounds(5,5+40,170,18);
        jta1.setBounds(130,5+40,100,18);

        JLabel cost = new JLabel("Цена ");
        cost.setBounds(5,26+40,170,18);
        jta2.setBounds(130,26+40,100,18);


        JLabel descrip = new JLabel("Описание");

        descrip.setBounds(5,47+40,170,18);
        jta3.setBounds(130,47+40,100,18);

        JLabel nameLabel = new JLabel("InternetOrder");
        nameLabel.setFont( new Font("Verdana", Font.PLAIN, 20));
        nameLabel.setBounds(55,6,170,20);

        panelLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelRight.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panelLeft.add(nameLabel);
        panelLeft.add(jta1);
        panelLeft.add(jta2);
        panelLeft.add(jta3);
        panelLeft.add(name);
        panelLeft.add(cost);
        panelLeft.add(descrip);
        panelLeft.add(panelGrid);
        panelLeft.add(add);
        panelLeft.add(delete);
        panelLeft.add(remove);

        //// Правая сторона

        JButton add2 = new JButton("add");
        add2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if((!jta21.getText().equals(""))&&(!jta22.getText().equals("")))
                    main.tableOrder.add(new Drink(Integer.parseInt(jta22.getText()), jta21.getText(), jta23.getText()));
                refresh2();

            }
        });
        add2.setBounds(5+5,75+40,70,30);

        JButton delete2 = new JButton("delete");
        delete2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main.tableOrder.remove(jta21.getText());
                refresh2();
            }
        });

        delete2.setBounds(83+5,75+40,70,30);

        JButton remove2 = new JButton("sort");
        remove2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuItem[] menuItem = main.tableOrder.sortedItemsByCostDesc();
                refresh2(menuItem);
            }
        });
        remove2.setBounds(161+5,75+40,70,30);

        JButton create = new JButton("create");

        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (InternetOrder.size!=0)
                {
                    main.tableOrder = new TableOrder(main.internetOrder.getItems());
                    refresh2();
                }


            }
        });

        create.setBounds(5+5,115+40,70,30);


        JButton save = new JButton("save");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Serializ.save();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        save.setBounds(83+5,115+40,70,30);

        JButton open = new JButton("open");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    main.tableOrder=Serializ.openSave();
                    refresh2();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        open.setBounds(161+5,115+40,70,30);


        JLabel name2 = new JLabel("Название ");
        name2.setBounds(5+5,5+40,170,18);
        jta21.setBounds(130+5,5+40,100,18);

        JLabel cost2 = new JLabel("Цена ");
        cost2.setBounds(5+5,26+40,170,18);
        jta22.setBounds(130+5,26+40,100,18);

        JLabel descrip2 = new JLabel("Описание");
        descrip2.setBounds(5+5,47+40,170,18);
        jta23.setBounds(130+5,47+40,100,18);

        JLabel nameLabel2 = new JLabel("TableOrder");
        nameLabel2.setFont( new Font("Verdana", Font.PLAIN, 20));
        nameLabel2.setBounds(55+5,6,170,20);

        panelRight.add(nameLabel2);

        panelRight.add(jta21);
        panelRight.add(jta22);
        panelRight.add(jta23);
        panelRight.add(name2);
        panelRight.add(cost2);
        panelRight.add(descrip2);
        panelRight.add(panelGrid2);
        panelRight.add(add2);
        panelRight.add(delete2);
        panelRight.add(remove2);
        panelRight.add(create);
        panelRight.add(save);
        panelRight.add(open);
        super.add(panelLeft);
        super.add(panelRight);

    }

    public static void refresh(MenuItem[] menuItems)
    {
        System.out.println(InternetOrder.size);
        panelGrid.removeAll();

        for (int i=0; i<menuItems.length; i++)
        {
            panelGrid.add(new JLabel(menuItems[i].toString()));
        }

        panelGrid.revalidate();
        panelGrid.repaint();
    }
    public static void refresh()
    {
        System.out.println(InternetOrder.size);
        panelGrid.removeAll();
        MenuItem[] menuItems = main.internetOrder.getItems();

        for (int i=0; i<menuItems.length; i++)
        {
            panelGrid.add(new JLabel(menuItems[i].toString()));
        }

        panelGrid.revalidate();
        panelGrid.repaint();
    }

    public static void refresh2(MenuItem[] menuItems)
    {
        System.out.println(InternetOrder.size);
        panelGrid2.removeAll();

        for (int i=0; i<menuItems.length; i++)
        {
            panelGrid2.add(new JLabel(menuItems[i].toString()));
        }

        panelGrid2.revalidate();
        panelGrid2.repaint();
    }
    public static void refresh2()
    {

        panelGrid2.removeAll();
        MenuItem[] menuItems = main.tableOrder.getItems();

        for (int i=0; i<menuItems.length; i++)
        {
            panelGrid2.add(new JLabel(menuItems[i].toString()));
        }

        panelGrid2.revalidate();
        panelGrid2.repaint();
    }
}