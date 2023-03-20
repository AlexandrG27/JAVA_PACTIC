package ru.mirea.task29;


import org.junit.Assert;
import org.junit.Test;
import ru.mirea.lab1.Homework23.LinkedQueue;

import java.util.List;

public class InternetOrder {

    RestaurantOrder head; // Указывает на головной объект
    RestaurantOrder tail; // Указывает на последний объект


    private static class RestaurantOrder
    {
        List<Item> list;
        RestaurantOrder next; // Хранит ссылку на следующий объект
        public RestaurantOrder(List<Item> list) {
            this.list=list;
        }


    }

    public boolean findItemList(List <Item> list, String name) {


        for (int i=0;i<list.size(); i++)
        {
            if (list.get(i).getName().equals(name))
            {
                list.remove(i);

                return true;
            }

        }

        return false;
    }

    public int findAllItemList(List <Item> list, String name) {

        int countDeleteItem=0;
        for (int i=0;i<list.size(); i++)
        {
            if (list.get(i).getName().equals(name))
            {
                list.remove(i);

                countDeleteItem++;
            }

        }

        return countDeleteItem;
    }

    public void addNode(List <Item> list) {
        RestaurantOrder newNode = new RestaurantOrder( list);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode; // Устанавливает ссылку на последний объект, только что созданный
        tail.next = head; // Следующим объектом становится головной объект
    }



    public boolean deleteItem(String name) {



        RestaurantOrder current=head;

        do {
            {
                if (findItemList(current.next.list, name))
                {
                    if (current.next.list.isEmpty())
                    {
                        if (current.next==head) //Если элемент который нужно удалить является головным
                            head=current.next.next;

                        else if (current.next==tail) // Если элемент который нужно удалить является последним
                            tail=current;


                        current.next=current.next.next; //Переписываем ссылку на следующий элемент
                        return true;
                    }
                    return true;

                }
                else
                    current=current.next;
            }
        }
        while (current!=head);

        return false;

    }

    public int deleteAllItem(String name) {

        RestaurantOrder current=head;

        int countDeleteItem=0;

        do {
            {
                countDeleteItem+=findAllItemList(current.next.list, name);
                if (current.next.list.isEmpty())
                {
                    if (current.next==head) //Если элемент который нужно удалить является головным
                        head=current.next.next;

                    else if (current.next==tail) // Если элемент который нужно удалить является последним
                        tail=current;

                    current.next=current.next.next; //Переписываем ссылку на следующий элемент
                    countDeleteItem+=deleteAllItem(name);

                }
                current=current.next;
            }
        }
        while (current!=head);

        return countDeleteItem;

    }

    public int orderItem()
    {
        int count =0;
        RestaurantOrder current=head;
        do {
            {
                count++;
                current=current.next;
            }
        }
        while ((current!=head));
        return count;
    }


    public int listPrice(List <Item> list) {

        int totalCost=0;

        for (Item lis : list) {
            totalCost+=lis.getPrice();
        }
        return totalCost;
    }

    public int totalCost()
    {
        int totalCost =0;
        int i=1;
        RestaurantOrder current=head;
        do {
            {

                System.out.println("Цена заказа № "+i+": "+listPrice(current.list)+"руб.");
                totalCost+=listPrice(current.list);
                i++;
                current=current.next;
            }
        }
        while ((current!=head));
        return totalCost;
    }

    public int findMealsOrDrinks(List <Item> list, String name) {

        int count=0;
        for (int i=0;i<list.size(); i++)
        {
            if (list.get(i).getName().equals(name))
            {
                count++;
            }

        }

        return count;
    }

    public int numberOfMealsOrDrinks(String name)
    {

        int count=0;
        RestaurantOrder current=head;
        do {
            {

                count+=findMealsOrDrinks(current.list,name);

                current=current.next;
            }
        }
        while ((current!=head));
        return count;
    }
    public void printList(List <Item> list) {
        for (Item lis : list) {
            System.out.println(lis.getName());
        }
    }


    public void print()
    {
        System.out.println("Все заказы: ");
        RestaurantOrder current=head;
        do {
            printList(current.list);
            current=current.next;
        }
        while (current!=head);
    }
}