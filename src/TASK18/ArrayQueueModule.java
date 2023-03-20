package ru.mirea.lab1.Homework23;

public class ArrayQueueModule {
    private static final int capacity =100;
    public static Object[] array=new Object[capacity];
    public static int size=0;



    public static void enqueue(Object element)
    {
        array[size]=element;
        size++;
    }

    public static Object element() {
        return array[0];
    }

    public static Object dequeue() {
        Object buf=array[0];
        for (int i =0;i< size-1;i++)
        {
            array[i]=array[i+1];
        }
        array[size-1]=buf;
        return  buf;
    }


    public static int size() {
        return size;
    }


    public static boolean isEmpty() {
        if (size>0)
            return true;
        else
            return false;
    }


    public static void clear() {

        array=new Object[capacity];
        size=0;
    }
}
