package Ex2.Pocker;
import java.util.*;
    public class PokerTest
    {
        public static void main(String[] args)
        {
            Poker poker = new Poker();
            Scanner input = new Scanner(System.in);
            do
                System.out.print("В покер могут играть только 10 человек. Введите количество игроков, не превышающее лимит:");
            while (!input.hasNextInt());
            int players = input.nextInt();
            if (players > 10)
            {
                System.out.println("Вы превысили лимит игроков. Всего доброго.");
            }
            else
            {
                for (int i = 0; i < players; i++)
                {
                    System.out.println(poker.getDeck());
                }
            }
        }
    }
