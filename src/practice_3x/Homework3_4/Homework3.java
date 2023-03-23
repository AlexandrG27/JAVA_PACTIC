package Practice_3X.Homework3_4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Homework3
{
    public static void main(String args[])
    {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int n;
        while(true)
        {
            n = input.nextInt();
            if (n>3)
                break;
            else
                System.out.println("Введите число больше 3");
        }
        int arr[]=new int[n];
        int count=0;
        System.out.print("Массив:");
        for (int i=0; i<n;i++)
        {
            arr[i]=rand.nextInt(1,n);
            if(arr[i] % 2 == 0)
            {
                count++;
            }
            System.out.print(arr[i]);
        }
        if (count!=0)
        {
            int arr2[]=new int[count];
            int index=0;
            System.out.print("\n"+"Четные числа:");
            for (int i=0; i<n;i++)
            {
                if(arr[i] % 2 == 0)
                {
                    arr2[index]=arr[i];
                    System.out.print(arr2[index]);
                }
            }
        }
    }
}
