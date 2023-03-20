package ex4_1;

import java.util.Scanner;

public class Year
{
    public enum Season
    {
        Winter(-15), Spring(10), Summer(20)
            {
                @Override
                public String getDescription()
                {
                    return "Warm season";
                }
            },
        Autumn(10);
        private int avgTemp;
        Season(int avgTemp)
        {
            this.avgTemp=avgTemp;
        }
        public int getAvgTemp()
        {
            return avgTemp;
        }

        public String getDescription()
        {
            return "Cold season";
        }
    }

    public static void main(String[] args)
    {
        Season season1 = Season.Summer;
        System.out.println("My favourite season is " + season1);
        print(Season.Autumn);
        printAllValues();
    }

    public static void print(Season season)
    {
        switch (season)
        {
            case Winter -> System.out.println("I love Winter");
            case Spring -> System.out.println("I love Spring");
            case Summer -> System.out.println("I love Summer");
            case Autumn -> System.out.println("I love Autumn");
        }
    }

    public static void printAllValues()
    {
        for(Season s : Season.values())
        {
            System.out.println(s + " " + s.getAvgTemp() +" "+ s.getDescription());
        }
    }
}
