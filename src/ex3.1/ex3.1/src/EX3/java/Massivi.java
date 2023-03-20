package EX3.java;
import java.util.Arrays;
import java.util.Scanner;
public class Massivi
{
    public static void main(String[] args)
    {
        massivi();
    }
    public static void massivi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = 0;
        while (n <= 10) {
            if (sc.hasNextInt())
            {
                n = sc.nextInt();
                if (n <= 10)
                {
                    System.out.println("Введенное число должно быть больше 10. Повторите ввод:");
                }
            }
            else
            {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int[] mas1 = new int[n];
        int evenNums = 0;
        for (int i = 0; i < n; i++)
        {
            mas1[i] = (int) (Math.random() * (n + 1));
            if (mas1[i] % 2 == 0)
            {
                evenNums++;
            }
        }
        System.out.println("Массив:");
        System.out.println(Arrays.toString(mas1));
        int[] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            if (mas1[i] % 2 == 0)
            {
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println("Массив с четными числами:");
        System.out.println(Arrays.toString(mas2));
    }
}
