package ru.mirea.lab1.Homework23;

public class ArrayQueueADTTest {
    public static void main(String[] args) {

        ArrayQueueADT queue = new ArrayQueueADT();

        for (int i=1;i<11; i++)
        {
            ArrayQueueADT.enqueue(queue, i);
        }

        for (int i=1;i<11; i++)
        {
            System.out.println(ArrayQueueADT.dequeue(queue));
        }




    }
}
