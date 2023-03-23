package Practice_8X.Homework8_9;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество нулей ");
        int a=input.nextInt();
        System.out.print("Введите количество единиц ");
        int b=input.nextInt();
        System.out.println(fun(a,b));
    }
    public static int fun(int a, int b)
    {
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return fun(a, b - 1) + fun(a - 1, b - 1);
    }
}