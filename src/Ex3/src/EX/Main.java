package EX;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.in;
public class Massiv {
    public static void main(String[] args) {
        short item;
        Scanner in = new Scanner(System.in);
        System.out.print("0 выход из программы\n1-вывод 1 метода\n2-вызов 2 метода\n");
        item = in.nextShort();
        switch (item) {
            case 1:
                random1();
                break;
            case 2:
                random2();
                break;
            default:System.out.println("конец программы");
                break;
        }
        in.close();
    }
    public static void random1() {
        System.out.println("Введите количество элементов массива");
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        Random m = new Random();
        int mas[] = new int[n];
        for (int i = 0; i < 10; i++) {
            mas[i] = m.nextInt(100);
            System.out.println(mas[i]);
        }
        Arrays.sort(mas);
        for (int values : mas) {
            System.out.print(values + ", ");
        }
    }
    public static void random2()
    {
        System.out.println("Введите количество элементов массива");
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        Random m = new Random();
        int mas[] = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 1000);
            System.out.println(mas[i]);
        }
        System.out.println("сортированный массив ");
        Arrays.sort(mas);
        for (int values : mas) {
            System.out.print(values + ", ");
        }
    }
}