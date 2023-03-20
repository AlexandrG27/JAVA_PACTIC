package ru.mirea.lab1.Homework20;


import java.io.Serializable;

public class General <T,V,K> implements Comparable<T>, Serializable{

    // Интерфейс Serializable является интерфейсом маркером, в нем нет ни одного метода
    private T content;
    private V content1;
    private K content2;

    public General(T content, V content1, K content2) {
        this.content = content;
        this.content1 = content1;
        this.content2 = content2;

    }

    public T getContent() {
        return content;
    }

    public void Print()
    {
        System.out.println(content.getClass().getSimpleName());
        System.out.println(content1.getClass().getSimpleName());
        System.out.println(content2.getClass().getSimpleName());
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
