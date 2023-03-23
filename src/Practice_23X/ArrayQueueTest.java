package Practice_23X;
public class ArrayQueueTest
{
    public static void main(String[] args) {
        ArrayQueue queue=new ArrayQueue();
        for (int i=1; i<11;i++)
            queue.enqueue(i);
        for (int i=0;i< queue.size();i++)
            System.out.println(queue.dequeue());
        queue.clear();
        System.out.println(queue.isEmpty());
        queue.enqueue("1 элемент");
        queue.enqueue("2 элемент");
        System.out.println(queue.element());
    }
}
