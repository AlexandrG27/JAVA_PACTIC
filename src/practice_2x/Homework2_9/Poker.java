package Practice_2X.Homework2_9;
import java.util.*;
public class Poker {
    private String[] arrDeck = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",};
    private String[] arrSuit = {"\u2664","\u2667","\u2666","\u2665" };
    private String card="";
    private String hand="";
    private List<String> usedCard = new ArrayList<String>();
    Poker(int player)
    {
        Random Random = new Random();
        for (int i=1; i<=player && i <=10; i++)
        {
            for (int j=0; j!=5;)
            {
                card = randomItem(arrDeck) + randomItem(arrSuit);
                for (int k=0;k<usedCard.size(); k++ )
                {
                    if (usedCard.get(k).equals(card))
                    {
                        card=null;
                        break;
                    }
                }
                if (card!=null)
                {
                    usedCard.add(card);
                    hand+=card+" ";
                    j++;
                }
            }
            System.out.println("Карты "+i+" игрока: " + hand );
            hand="";
        }
    }
    public static <T> T randomItem (T[] array)
    {
        Random random = new Random();
        return array[random.nextInt( array.length )];
    }
}
