package ru.mirea.lab1.Homework23;

public interface Queue {

    void enqueue (Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();

}
