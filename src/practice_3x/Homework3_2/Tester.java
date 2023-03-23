package Practice_3X.Homework3_2;
import java.util.Arrays;
public class Tester
{
    private static int size =5;
    private static Circle[] arr=new Circle[size];
    public static void main(String args[])
    {
        for(int i=0; i<size;i++)
        {
            arr[i]= new Circle();
            System.out.println(arr[i].ToString()+'\n');
        }
        System.out.println("Самая большая окружность"+'\n'+smallCircle().ToString()+'\n');
        System.out.println("Наименьшая окружность"+'\n'+bigCircle().ToString()+'\n');
        sortCircle();

        System.out.println("Окружности упорядоченны в порядке возрастания:");
        for(int i=0; i<size;i++)
        {
            System.out.println("Радиус:"+arr[i].getR());
        }
    }
    public static Circle smallCircle()
    {
        Circle min= new Circle(0,0);
        for (int i=0;i<size;i++)
        {
            if (arr[i].getC()> min.getC())
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static Circle bigCircle()
    {
        Circle min = smallCircle();
        for (int i=0;i<size;i++)
        {
            if (arr[i].getC()< min.getC())
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void sortCircle()
    {
        for (int i = 0; i < arr.length; i++)
        {
            Circle min = arr[i];
            int min_i = i;
            for (int j = i; j < arr.length; j++)
            {
                if (arr[j].getC() < min.getC())
                {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i)
            {
                Circle tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
}
