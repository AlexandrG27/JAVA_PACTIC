package ru.mirea.task30;

public interface OrderManager {

    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem itemName);
    Order[] getOrders();
    int orderCostSummary();
    int orderQuantity();
}