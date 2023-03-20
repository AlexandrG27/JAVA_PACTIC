package ru.mirea.lab1.Homework23;

public class ArrayQueueTest {
    public static void main(String[] args) {

        ArrayQueue queue=new ArrayQueue();  // Создание очереди
        for (int i=1; i<11;i++)                         //Добавление элементов в очередь
             queue.enqueue(i);

        for (int i=0;i< queue.size();i++)               // Вывод элемента который удалили, а затем вернули в очередь
            System.out.println(queue.dequeue());


        queue.clear();                                  // Очищаем очередь
        System.out.println(queue.isEmpty());            // Проверка пуста ли очередь
        queue.enqueue("1 элемент");
        queue.enqueue("2 элемент");  // Добавляем элемент в очередь
        System.out.println(queue.element());            //Вывод первого эдемента в очереди






    }
}
