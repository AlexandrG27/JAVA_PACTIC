package Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int n = -1;
        while (n <= 0)
        {
            do
                System.out.println("Введите число n");
            while (!input.hasNextInt());
            n = input.nextInt();
        }
        int[] nArr = new int[n];
        System.out.print("Массив из n чисел - ");
        for (int i = 0; i < nArr.length; i++)
        {
            nArr[i] = random.nextInt(0, n+1);
            System.out.print(nArr[i] + " ");
        }
        System.out.println();
        List <Integer> nEvenArr = new ArrayList<>();
        for (int i : nArr)
            if (i % 2 == 0)
                nEvenArr.add(i);

        System.out.print("Чётные числа массива из n чисел - ");
        for (int i: nEvenArr)
            System.out.print(i + " ");
    }
}
