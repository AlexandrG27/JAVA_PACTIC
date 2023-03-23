package Practice_14X;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework14_1
{
    public static void main(String[] args)
    {
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java5tiger 77 java6mustang");
        for (String word : words)
            System.out.println(word);
        Pattern p2 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m = p2.matcher( "abcdefghijklmnopqrstuv18340" );
        boolean b = m.matches();
        System.out.println(b);
        String price =" 25.98 USD  27.7 EU  50 RUB 100 RUB";
        Pattern eu=Pattern.compile("\\d+.\\d*\\sEU");
        Pattern usd=Pattern.compile("\\d+.\\d*\\sUSD");
        Pattern rub=Pattern.compile("\\d+.\\d*\\sRUB");
        Matcher m1=eu.matcher(price);
        while (m1.find())
        {
            System.out.println(m1.group());
        }
        Matcher m2=usd.matcher(price);
        while (m2.find())
        {
            System.out.println(m2.group());
        }
        Matcher m3=rub.matcher(price);
        while (m3.find())
        {
            System.out.println(m3.group());
        }
        Pattern p4 = Pattern.compile("\\+\\d");
        Matcher m4 = p4.matcher( "(1+8)–9/4" );
        while (m4.find())
        {
            System.out.println("Задание 4. выржаение (1+8)–9/4: "+m4.group());
        }
        var test = Pattern.compile("\\d{2}\\/\\d{2}\\/(([1-9]9\\d{2})|([2-9]\\d{3}))").matcher("29/02/2001");
        if(test.find())
            System.out.println("Задание 5. выржаение 29/02/2000: "+"подходит");
        else System.out.println("Задание 5. выржаение : "+"не подходит");
        test = Pattern.compile("\\w+@(([a-zA-Z]+[^com|ru][^\\.]$)|([a-zA-Z]+[^com|ru]\\.(com|ru)$))").matcher("usermail@mail.com");
        if(test.find())
            System.out.println("Задание 6. выражение usermail@mail.com: "+"подходит");
        else System.out.println("Задание 6. выражение usermail@mail.com: "+"не подходит");
        test = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$").matcher("ssword");
        if(test.find())
            System.out.println("Задание 7. F032_Password: "+"Пароль подходит");
        else
            System.out.println("Задание 7. F032_Password: "+"Пароль не подходит");
    }
}
