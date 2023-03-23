package Practice_2X.Homework2_9;
import java.util.Scanner;
public class  StartGame
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество игроков " );
        int player =input.nextInt();
        Poker poker = new Poker(player);
    }
}