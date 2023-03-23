package Practice_23X;
public class ArrayQueue implements Queue {
    private static final int capacity =100;
    public static Object[] array;
    public static int size=0;
    public ArrayQueue()
    {
        array=new Object[capacity];
    }
    @Override
    public void enqueue(Object element)
    {
        array[size]=element;
        size++;
    }
    @Override
    public Object element()
    {
        return array[0];
    }
    @Override
    public Object dequeue()
    {
        Object buf=array[0];
        for (int i =0;i< size-1;i++)
        {
            array[i]=array[i+1];
        }
        array[size-1]=buf;
        return  buf;
    }
    @Override
    public int size()
    {
        return size;
    }
    @Override
    public boolean isEmpty()
    {
        if (size>0)
            return true;
        else
            return false;
    }
    @Override
    public void clear()
    {
        array=new Object[capacity];
        size=0;
    }
}
