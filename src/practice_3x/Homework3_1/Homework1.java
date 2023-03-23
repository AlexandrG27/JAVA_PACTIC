package Practice_3X.Homework3_1;
import java.util.Arrays;
import java.util.Random;
public class Homework1 {
    public static void main(String args[])
    {
        Random rand = new Random();
        double[] arr1 =new double[5];
        double[] arr2 =new double[5];
        for(int i=0;i<5; i++)
        {
            arr1[i]=rand.nextDouble(100);
            arr2[i]=Math.random();
        }
        System.out.println("Массив Rand: "+Arrays.toString(arr1));
        System.out.println("Массив Math.random: "+Arrays.toString(arr2));
        sort(arr1);
        sort(arr2);
    }
    public static void sort(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            var min = arr[i];
            int min_i = i;
            for (int j = i; j < arr.length; j++)
            {
                if (arr[j] < min)
                {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i)
            {
                var tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println("Отсортированный массив: "+Arrays.toString(arr));
    }
}
