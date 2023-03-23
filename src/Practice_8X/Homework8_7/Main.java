package Practice_8X.Homework8_7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите натуральное число больше 1 ");
        int a = input.nextInt();
        simple(a);
    }
    public static void simple(int a)
    {
        for (int i=2; ; i++)
        {
            if (a%i==0)
            {
                System.out.println(i);
                a=a/i;
                if((a==0)||(a==1))
                {
                    System.exit (1);
                }
                else simple(a);
            }
        }
    }
}
