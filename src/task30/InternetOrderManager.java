package ru.mirea.task30;

public class InternetOrderManager {

    private QueueNode head;
    private QueueNode tail;
    private int size=0;

    public boolean add(Order order)
    {
        size++;
        QueueNode newNode = new QueueNode(order);

        if (head == null)
        {
            head = newNode;
        }

        else
        {
            tail.next = newNode;
        }

        tail = newNode; // Устанавливает ссылку на последний объект, только что созданный
        tail.next = head; // Следующим объектом становится головной объект

        return true;
    }

    public Order remove()
    {
        QueueNode current=head;

        int quantityName=0;

        do {
            {
                current=null;
                current=current.next;

            }
        }
        while (current!=null);

        return current.value;
    }
    public Order order()
    {
        return  null;
    }

    private class QueueNode {

        private QueueNode next;
        private QueueNode prev;
        private Order value;

        public QueueNode( Order value) {
            this.value = value;
        }
    }
}