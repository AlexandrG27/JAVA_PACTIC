package Practice_6X.Homework6_3;
import java.util.Scanner;
public class main implements Convertable
{
    main(int temp)
    {
        convert(temp);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите t℃: ");
        int temp = input.nextInt();
        new main(temp);
    }
    @Override
    public void convert(int temp)
    {
        System.out.println("Температура в Фарингейтах = "+(1.8*temp+32)+" °F");
        System.out.println("Температура в Кельвинах = "+(temp+273.15)+" K");

    }
}