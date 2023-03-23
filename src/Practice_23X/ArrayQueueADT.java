package Practice_23X;
public class ArrayQueueADT {
    private  final int capacity =100;
    private  Object[] array=new Object[capacity];
    private  int size=0;
    public static void enqueue(ArrayQueueADT adt, Object element)
    {
        adt.array[adt.size]=element;
        adt.size++;
    }
    public static Object element(ArrayQueueADT adt)
    {
        return adt.array[0];
    }
    public static Object dequeue(ArrayQueueADT adt)
    {
        Object buf=adt.array[0];
        for (int i =0;i< adt.size-1;i++)
        {
            adt.array[i]=adt.array[i+1];
        }
        adt.array[adt.size-1]=buf;
        return  buf;
    }

    public static int size(ArrayQueueADT adt)
    {
        return adt.size;
    }
    public static boolean isEmpty(ArrayQueueADT adt)
    {
        if (adt.size>0)
            return true;
        else
            return false;
    }
    public static void clear(ArrayQueueADT adt)
    {
        adt.array=new Object[adt.capacity];
        adt.size=0;
    }
}
