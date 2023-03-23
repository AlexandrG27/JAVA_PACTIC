package Practice_2X.Homework2_10;
import java.util.Scanner;
public class HowMany
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите предложение " );
        String line = input.nextLine();
        int spaceCount = 0;
        for (char c : line.toCharArray()) {
            if ((c == ' '))
            {
                spaceCount++;
            }
        }
        System.out.print("Количество слов: " + (spaceCount+1));
    }
}
