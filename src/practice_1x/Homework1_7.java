package Practice_1X;
import java.util.Scanner;
public class Homework1_7
{
    public static void Task()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число ");
        int a = input.nextInt();
        int b=1;
        for (int i=1; i<=a; i++)
        {
            b=i*b;
        }
        System.out.println ("Факториал числа "+ a+"="+b);
    }
}
