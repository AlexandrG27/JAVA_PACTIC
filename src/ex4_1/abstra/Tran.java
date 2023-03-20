package ex4_1.abstra;

import java.util.Scanner;

public class Tran extends Absra {
    public void car() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько пассажиров? ");
        int a = in.nextInt();
        if (a > 4)
            System.out.println("Cтолько пассажиров невозможно увести на одном авто");
        else {
            System.out.println("Время поездки от Мирэа до Беляево составляет: 20 мин без пробок");
            System.out.println("Cтоимость поездки составит: 304 руб");
            System.out.println("Перевозка груза бесплатно!");
        }
    }

    @Override
    public void airplane() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько пассажиров? ");
        int a = in.nextInt();
        if (a > 215)
            System.out.println("Cтолько пассажиров невозможно увести на одном cамолете");
        else {
            System.out.println("Время полета от Шереметьево до Пулково составляет: 1 час 30 мин");
            System.out.println("Cтоимость поездки составит: от 1304 руб до 3500 руб");
            System.out.println("Сколько примерно весит ваш груз?");
            double  b = in.nextDouble();
            if(b > 23)
                System.out.println("Стоимость перевозки груза 100 евро за 1 кг");
            else
                System.out.println("Стоимость перевозки груза бесплатна");
        }
    }

    public void train() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько пассажиров? ");
        int a = in.nextInt();
        if (a > 522)
            System.out.println("Cтолько пассажиров невозможно увести на одном поезде");
        else {
            System.out.println("Время пути от Москвы до СПБ составляет: 4 часа");
            System.out.println("Cтоимость поездки составит: 3000 руб");
            System.out.println("Стоимость перевозки груза бесплатна");
        }
    }
    public void ship() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько пассажиров? ");
        int a = in.nextInt();
        if (a > 120)
            System.out.println("Cтолько пассажиров невозможно увести на одном корабле");
        else {
            System.out.println("Время пути от Сочи до СПБ Геленджика: 3 часа 15 мин");
            System.out.println("Cтоимость поездки составит: 2500 руб");
            System.out.println("Стоимость перевозки груза бесплатна");
        }
    }
}
