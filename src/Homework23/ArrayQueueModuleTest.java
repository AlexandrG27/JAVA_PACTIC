package ru.mirea.lab1.Homework23;

public class ArrayQueueModuleTest {
    public static void main(String[] args) {


        for (int i=1;i<11; i++)
            ArrayQueueModule.enqueue(i);

        for (int i=1;i<11; i++)
            System.out.println(ArrayQueueModule.dequeue());
    }
}
