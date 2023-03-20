package ru.mirea.lab1.Homework19.Homework19_2;


import java.util.Scanner;

public class main {

    static  boolean search =false;

    public static Student[] arr={new Student("Заволокин", "Иван", "Сергеевич", 79),
            new Student("Бедрединов", "Роман", "Равильевич", 48),
            new Student("Азарян", "Давид", "Ноунеймович", 65),
            new Student("Пушкин", "Давид", "романович", 95)
    };

    public static void main(String[] args) throws ExceptionName {

        Scanner input =new Scanner(System.in);
        System.out.println("Введите ФИО");
        String surname = input.nextLine();
        findUser(surname);
    }

    private static void findUser(String surname) throws ExceptionName {

        String [] split=surname.split(" ");
        for (int i=0;i< arr.length;i++)
        {
            if (split[0].equals(arr[i].getSurname()))
            {
                search=true;
                if((arr[i].getName().equals(split[1]))&&(arr[i].getMidName().equals(split[2])))
                {
                    System.out.println("Студент найден");
                    System.out.println(arr[i].toString());
                }
                else
                    search=false;
            }
        }
        if (!search)
            throw new ExceptionName("Студент не найден");

    }
}
