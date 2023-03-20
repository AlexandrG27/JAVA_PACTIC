package ru.mirea.task29;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {


    private static Map<Integer, List <Item>> student = new HashMap<Integer, List <Item>>();
    private int table=0;

    public void addOrder(int table, List<Item> list)
    {

        student.put(table, list);

    }

    public void deleteOrder(int table)
    {
        student.remove(table);
    }

    public void printOrder()
    {
        for (Map.Entry<Integer, List <Item>> entry : student.entrySet()) {
            System.out.println("Заказ № "+entry.getKey());
            for (int i=0; i<entry.getValue().size(); i++)
            {
                System.out.println(entry.getValue().get(i).getName());
            }

        }
    }


    public void addOrderPosition(int i, Item list) throws Exception {

        if (student.get(i).contains(list.getName()))
            throw new Exception("OrderAlreadyAddedException");

        student.get(i).add(list);

    }

    public void printPrice()
    {
        int sum=0;
        for (Map.Entry<Integer, List <Item>> entry : student.entrySet()) {

            for (int i=0; i<entry.getValue().size(); i++)
            {
                sum+=entry.getValue().get(i).getPrice();
            }

        }
        System.out.println("Общая сумма заказов "+sum);
    }




}