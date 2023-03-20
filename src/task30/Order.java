package ru.mirea.task30;

import java.io.Serializable;

public interface Order extends Serializable {

    boolean add(MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem itemName);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeAll(String itemName);
    int removeAll(MenuItem itemName);
    MenuItem[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);

}