package Practice_30X;
public interface OrderManager
{
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem itemName);
    Order[] getOrders();
    int orderCostSummary();
    int orderQuantity();
}
