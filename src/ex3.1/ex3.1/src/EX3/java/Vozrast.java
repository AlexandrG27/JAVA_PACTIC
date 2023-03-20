package EX3.java;
import java.util.Random;
public class Vozrast
{
    public static int randInt(int min, int max)
    {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    public static void main(String[] args)
    {
        int[] Mas = new int[4];
        for (int i = 0; i < Mas.length; i++)
        {
            Mas[i] = randInt(10, 99);
            System.out.print(Mas[i] + " ");
        }

        String result = "Прогрессия возрастающая";
        for (int i = 0; i < Mas.length; i++)
        {
            if (i > 0 && Mas[i - 1] >= Mas[i])
            {
                result = "Прогрессия не возрастающая";
                break;
            }
        }
        System.out.print(result);
    }
}