package ru.mirea.task30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableOrder implements Order {
    private int size;
    private MenuItem[] items;

    public TableOrder(MenuItem[] items) {
        this.items = items;

    }

    @Override
    public boolean add(MenuItem item) {

        MenuItem[] newItems= new MenuItem[items.length+1];
        for (int i=0; i<items.length; i++)
            newItems[i]=items[i];

        newItems[newItems.length-1]=item;

        items=newItems;

        size=items.length;

        return true;
    }

    @Override
    public String[] itemsNames() {

        String[] name = new String[items.length];

        for (int i=0; i<items.length; i++)
        {
            name[i]=items[i].getName();
        }
        return name;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {

        int countName = 0;

        for (int i=0; i<items.length; i++)
        {
            if(items[i].getName().equals(itemName))
            {
                countName++;
            }
        }
        return countName;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {

        int countName = 0;

        for (int i=0; i<items.length; i++)
        {
            if(items[i].equals(itemName))
            {
                countName++;
            }
        }
        return countName;

    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {


        List<MenuItem> myList = new ArrayList<>();


        for (int i =0 ; i<items.length; i++)
        {
            myList.add(items[i]);
        }

        for (int i=0; i<myList.size(); i++)
        {
            if (myList.get(i).getName().equals(itemName))
            {
                myList.remove(i);
                break;
            }

        }

        MenuItem[] newItems= new MenuItem[myList.size()];

        for (int i =0 ; i<myList.size(); i++)
        {
            newItems[i]=myList.get(i);
        }

        items=newItems;

        return true;
    }

    @Override
    public boolean remove(MenuItem item) {

        int delete=-1;

        for (int i=0; i<items.length; i++)
        {
            if (items[i].equals(item))
            {
                delete = i;
                break;
            }
        }

        if (delete>=0)
        {
            MenuItem[] newItems= new MenuItem[items.length-1];
            for (int i=0; i<size-1; i++)
            {
                if (i>=delete)
                {

                    newItems[i]=items[i+1];
                }
                else

                    newItems[i]=items[i];
            }

            items=newItems;
            return true;
        }


        return false;
    }

    @Override
    public int removeAll(String itemName) {

        List<MenuItem> myList = new ArrayList<>();
        int delete=0;

        for (int i =0 ; i<items.length; i++)
        {
            myList.add(items[i]);
        }

        for (int i=0; i<myList.size(); i++)
        {
            if (myList.get(i).getName().equals(itemName))
            {
                myList.remove(i);
                delete++;
            }

        }

        MenuItem[] newItems= new MenuItem[myList.size()];

        for (int i =0 ; i<myList.size(); i++)
        {
            newItems[i]=myList.get(i);
        }

        items=newItems;

        return 0;
    }

    @Override
    public int removeAll(MenuItem itemName) {
        List<MenuItem> myList = new ArrayList<>();
        int delete=0;

        for (int i =0 ; i<items.length; i++)
        {
            myList.add(items[i]);
        }

        for (int i=0; i<myList.size(); i++)
        {
            if (myList.get(i).equals(itemName))
            {
                myList.remove(i);
                delete++;
            }

        }

        MenuItem[] newItems= new MenuItem[myList.size()];

        for (int i =0 ; i<myList.size(); i++)
        {
            newItems[i]=myList.get(i);
        }

        items=newItems;

        return 0;

    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {

        MenuItem[] menuItems= items;


        for (int i=0; i <items.length; i++)
        {
            for (int j=0; j <items.length; j++)
            {
                if(items[i].getCost()<items[j].getCost())
                {
                    MenuItem buf=items[i];
                    items[i]=items[j];
                    items[j]=buf;

                }
            }
        }

        return menuItems;
    }

    @Override
    public int costTotal() {
        int cost=0;
        for (int i=0; i <items.length; i++)
            cost+=items[i].getCost();
        return cost;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {

    }
}