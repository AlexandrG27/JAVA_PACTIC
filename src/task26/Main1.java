package ru.mirea.task26;


import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(2);
        queue.add(5);
        queue.add(1);
        queue.add(6);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(10);
        queue.add(9);
        queue.add(8);

        while (!queue.isEmpty())
        {
            System.out.print(queue.poll() + " ");
        }


    }
}