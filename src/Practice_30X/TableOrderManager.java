package Practice_30X;
public class TableOrderManager implements OrderManager
{
    private Order[] order;
    public TableOrderManager(Order[] order)
    {
        this.order = order;
    }
    public void add (Order order, int tableName) { }
    public void addItem(MenuItem item, int tableNumber) { }
    public int freeTableNumber()
    {
        return 0;
    }
    public int[] freeTableNumbers()
    {
        return new int[0];
    }
    public Order getOrder(int tableNumber)
    {
        return null;
    }
    public void remove (int tableNumber) { }
    public int remove (Order order)
    {
        return 0;
    }
    public int removeAll (Order order)
    {
        return 0;
    }
    @Override
    public int itemsQuantity(String itemName)
    {
        return 0;
    }
    @Override
    public int itemsQuantity(MenuItem itemName)
    {
        return 0;
    }
    @Override
    public Order[] getOrders()
    {
        return new Order[0];
    }
    @Override
    public int orderCostSummary()
    {
        return 0;
    }
    @Override
    public int orderQuantity()
    {
        return 0;
    }
}