package Practice_8X.Homework8_8;
import java.util.Scanner;
public class Main
{
    private static String bufWord="";
    private static int countWord;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите слово ");
        String word = input.nextLine();
        countWord=word.length();
        simple(word);
    }
    public static void simple(String word)
    {
        char symbol=word.charAt(countWord-1);
        bufWord+=symbol;
        if(bufWord.equals(word))
        {
            System.out.println("YES");
            System.exit (1);
        }
        if ( countWord==1)
        {
            System.out.println("NO");
            System.exit (1);
        }
        countWord--;
        simple(word);
    }
}
