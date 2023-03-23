package Practice_25X.Homework25_2;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main
{
    public static String answer="";
    public static int index=0;
    public static boolean correct=true;
    public static void main(String[] args)
    {
        String temp = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Введите выражения через пробел. Пример (((24-2)+43-(32+1))/(43-43)+4) (43+)-32 ((34+1) (3+2) (21-32)*1)");
        String line = input.nextLine();
        line += " ";
        for (int i = 0; i < line.length(); i++)
        {
            if (line.charAt(i) != ' ')
            {
                temp += line.charAt(i);
            }
            if (line.charAt(i) == ' ')
            {
                expression(temp);
                if(correct)
                    answer+=temp+';'+' ';
                temp="";
                index=0;
            }
        }
        if (answer.length()!=0)
            System.out.println("Правильные выражения: "+answer);
    }
    public static void expression(String temp)
    {
        String bufLine="";
        for (; index<temp.length(); index++)
        {
            if (temp.charAt(index)=='(')
            {
                index++;
                bufLine+=staples(temp);
                continue;
            }

            bufLine+=temp.charAt(index);

        }

        var test = Pattern.compile("^(\\d+[^\\w]){1,}\\d+$").matcher(bufLine);

        if ((test.find())||(bufLine.equals("0")))
            correct=true;
        else
        {
            index=0;
            correct=false;
        }
    }
    public static String staples(String temp)
    {
        String bufLine = "";

        for(; index<temp.length();index++)
        {
            if (temp.charAt(index)=='(')
            {
                index++;
                bufLine+=staples(temp);
                if (index!=temp.length()-1)
                    index++;
            }
            if (temp.charAt(index)==')')
            {
                var test = Pattern.compile("^(\\d+[^\\w]){1,}\\d+$").matcher(bufLine);

                if (test.find())
                    return "0";
                else
                {
                    return"a";
                }
            }
            bufLine+=temp.charAt(index);
        }
        return  "a";
    }
}
