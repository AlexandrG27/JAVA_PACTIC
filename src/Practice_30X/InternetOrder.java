package Practice_30X;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
public class InternetOrder implements Order
{
    public static int size=0; //размер
    private ListNode head; //голова
    private ListNode tail; //хвост
    @Override
    public boolean add(MenuItem item)
    {
        size++;
        ListNode newNode = new ListNode(item);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
        return false;
    }
    @Override
    public String[] itemsNames()
    {
        String[] itemsName = new String[size];
        InternetOrder.ListNode current=head;
        int i=0;
        do {
            {
                itemsName[i]=current.value.getName();
                current=current.next;
                i++;
            }
        }
        while (current!=head);
        return itemsName;
    }
    @Override
    public int itemsQuantity()
    {
        return size;
    }
    @Override
    public int itemsQuantity(String itemName)
    {
        InternetOrder.ListNode current=head;
        int quantityName=0;
        do {
            {
                if (current.value.getName().equals(itemName))
                    quantityName++;
                current=current.next;
            }
        }
        while (current!=head);

        return quantityName;
    }
    @Override
    public int itemsQuantity(MenuItem itemName)
    {
        InternetOrder.ListNode current=head;
        int quantityName=0;
        do {
            {
                if (Objects.equals(current.value, itemName))
                    quantityName++;
                current=current.next;
            }
        }
        while (current!=head);
        return quantityName;
    }
    @Override
    public MenuItem[] getItems()
    {
        MenuItem[] menuItems = new MenuItem[size];
        if (size==0)
            return menuItems;
        InternetOrder.ListNode current=head;
        int i=0;
        do {
            {
                menuItems[i]=current.value;
                current=current.next;
                i++;
            }
        }
        while (current!=head);
        return menuItems;
    }
    @Override
    public boolean remove(String itemName)
    {
        InternetOrder.ListNode current=head;
        do {
            {
                if (current.next.value.getName().equals(itemName))
                {
                    if (current.next==head)
                        head=current.next.next;
                    else if (current.next==tail)
                        tail=current;
                    current.next=current.next.next;
                    size--;
                    if (size==0)
                    {
                        head=null;
                        tail=null;
                    }
                    return true;
                }
                current=current.next;
            }
        }
        while (current!=head);
        return false;
    }
    @Override
    public boolean remove(MenuItem item)
    {
        InternetOrder.ListNode current=head;
        do {
            {
                if (current.next.value.equals(item))
                {
                    if (current.next==head)
                        head=current.next.next;
                    else if (current.next==tail)
                        tail=current;
                    current.next=current.next.next;
                    size--;
                    return true;
                }
                current=current.next;
            }
        }
        while (current!=head);
        return false;
    }
    @Override
    public int removeAll(String itemName)
    {
        InternetOrder.ListNode current=head;
        int itemDelete=0;
        do {
            {
                if (current.next.value.getName().equals(itemName))
                {
                    if (current.next==head)
                        head=current.next.next;
                    else if (current.next==tail)
                        tail=current;
                    current.next=current.next.next;
                    size--;
                    itemDelete++;
                }
                current=current.next;
            }
        }
        while (current!=head);
        return itemDelete;
    }
    @Override
    public int removeAll(MenuItem itemName)
    {
        InternetOrder.ListNode current=head;
        int itemDelete=0;
        do {
            {
                if (current.next.value.equals(itemName))
                {
                    if (current.next==head)
                        head=current.next.next;
                    else if (current.next==tail)
                        tail=current;
                    current.next=current.next.next;
                    size--;
                    itemDelete++;
                }
                current=current.next;
            }
        }
        while (current!=head);
        return itemDelete;
    }
    @Override
    public MenuItem[] sortedItemsByCostDesc()
    {
        MenuItem[] menuItems= new MenuItem[size];
        ListNode current=head;
        int i=0;
        do {
            {
                menuItems[i]=current.value;
                current=current.next;
                i++;
            }
        }
        while (current!=head);
        for (i=0; i <menuItems.length; i++)
        {
            for (int j=0; j <menuItems.length; j++)
            {
                if(menuItems[i].getCost()<menuItems[j].getCost())
                {
                    MenuItem buf=menuItems[i];
                    menuItems[i]=menuItems[j];
                    menuItems[j]=buf;

                }
            }
        }
        return menuItems;
    }
    @Override
    public int costTotal()
    {
        InternetOrder.ListNode current=head;
        int cost=0;
        do {
            {
                cost+=current.value.getCost();
                current=current.next;
            }
        }
        while (current!=head);
        return cost;
    }
    @Override
    public Customer getCustomer()
    {
        return null;
    }
    @Override
    public void setCustomer(Customer customer) { }
    class ListNode {
        private ListNode next; //следующий объект
        private MenuItem value;
        public ListNode(MenuItem value)
        {
            this.value = value;
        }
    }
}
