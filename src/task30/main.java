package ru.mirea.task30;

import ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class main extends JFrame {

    public static InternetOrder internetOrder = new InternetOrder();
    public static TableOrder tableOrder;

    public static void main(String[] args) throws Exception{


        Form form = new Form();
        form.setVisible(true);