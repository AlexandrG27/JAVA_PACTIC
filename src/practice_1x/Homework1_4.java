package Practice_1X;
import java.util.Scanner;
public class Homework1_4
{
    public static void Task()
    {
        Scanner input = new Scanner(System.in);
        int i=0;
        int min=0, max=0;
        int sum=0;
        System.out.print("Введите размер массива: ");
        int size=input.nextInt();
        int[] arr = new int[size];
        while (i!=arr.length)
        {
            System.out.print("Введите значение массива " + ":" );
            arr[i] = input.nextInt();
            sum+=arr[i];
            i++;
        } i=0;
        while (i!=arr.length)
        {
            min=max;
            if (arr[i]>max)
            {
                max=arr[i];
            }
            i++;
        }
        i=0;
        while (i!=arr.length)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
            i++;
        }
        System.out.print("Сумма: "+ sum+"\n");
        System.out.print("Максимальное значение: "+ max+"\n");
        System.out.print("Минимальное значение: "+ min+"\n");
    }
}