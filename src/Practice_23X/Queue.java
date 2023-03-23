package Practice_23X;
public interface Queue
{
    void enqueue (Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
