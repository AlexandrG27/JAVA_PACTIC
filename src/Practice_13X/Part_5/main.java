package Practice_13X.Part_5;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class main
{
    public static String[] split;
    public static StringBuilder buf = new StringBuilder();
    public static int count=0;
    public static int maxCount=0;
    public static boolean ready=false;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String text=input.nextLine();
        split=text.split(" ");
        split();
        if (maxCount>0)
        {
            ready=true;
            split();
        }
        else
            System.out.println("Совпадений не найдено");
    }
    private static void split()
    {
        for (String sp:split)
        {
            getLine (sp);

            buf.setLength(0);
            if (maxCount<count)
                maxCount=count;
            count=0;
        }
    }
    private static void getLine(String text)
    {
        String lowerText=text.substring(0).toLowerCase();
        for (int i=0; i<split.length; i++)
        {
            String lowerSplit=split[i].substring(0).toLowerCase();

            if ((lowerText.charAt(text.length()-1)==lowerSplit.charAt(0))&&(buf.indexOf(split[i])==-1))
            {
                if(count==0)
                    buf.append(text);

                buf.append(" "+split[i]);
                count++;
                if(ready)
                {
                    if(count==maxCount)
                    {
                        for (String sp:split)
                        {
                            if(buf.indexOf(sp)==-1)
                                buf.append(" "+sp);
                        }
                        System.out.println(buf);
                        return;
                    }
                }
                getLine(split[i]);
            }
        }
    }
}
