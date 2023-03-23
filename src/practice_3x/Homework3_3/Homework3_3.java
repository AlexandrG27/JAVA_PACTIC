package Practice_3X.Homework3_3;
import java.util.Random;
public class Homework3_3
{
    public static void main(String args[])
    {
        Random rand = new Random();
        int arr[]=new int[4];
        String message="";
        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(10,99);
            if(i>0)
            {
                if(arr[i]<arr[i-1])
                {
                    message ="Массив не является строго возрастающим";
                }
            }
            System.out.print(arr[i]+" ");
        }
        if(message!="")
            System.out.println(message);
    }
}
