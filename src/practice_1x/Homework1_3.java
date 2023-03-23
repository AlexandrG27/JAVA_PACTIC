package Practice_1X;
public class Homework1_3
{
    public static void Task()
    {
        int sum=0;
        int[] array = {1,2,3};
        for(int i=0;i< array.length; i++)
        {
            sum+=array[i];
        }
        System.out.print("Сумма: "+ sum+"\n");
        System.out.print("Среднее: "+ (double)sum/ array.length);
    }
}
