package ru.mirea.lab1.Homework23;

import java.util.Iterator;

public class LinkedQueue<T> implements Iterable <T>{

    ListItem<T> head;
    ListItem<T> tail;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            ListItem<T> current=head; //Указатель на начало списка
            @Override
            public boolean hasNext() { //Есть ли еще элементы в списке
                return current!=null;
            }

            @Override
            public T next() {
                T data=current.data;
                current=current.next;
                return data;
            }
        };
    }

    private static class ListItem<T>
    {
        T data;
        ListItem<T> next;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void add(T item)
    {
        ListItem<T> newItem=new ListItem<>();
        newItem.data=item;

        if (isEmpty())
        {
            head=newItem;
            tail = newItem;
        }
        else
        {
            tail.next=newItem;
            tail = newItem;
        }


    }


}
