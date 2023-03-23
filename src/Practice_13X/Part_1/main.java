package Practice_13X.Part_1;
import java.util.Locale;
public class main
{
    public static void main(String[] args)
    {
        print ("I like java!!!");
        System.out.print("Задание 2. Программа возвращающая Ф.И.О: ");
        Person pers = new Person("Заволокин", "Александр");
        System.out.print(pers.toString());
    }
    public static void  print(String text)
    {
        System.out.println(text);
        int i = text.length();
        System.out.println("Последний символ строки: "+text.charAt(i-1));
        System.out.println("Заканчивается ли строка подстрокой - !!!: "+text.endsWith("!!!"));
        System.out.println("Начинается ли строка подстрокой - I like: "+text.startsWith("I like"));
        System.out.println("Содержит ли строка подстроку - Java: "+text.contains("java"));
        int index1 = text.indexOf("java");
        System.out.println("Позиция подстроки “Java” в строке “I like Java!!!”:  "+index1);
        System.out.println("Замена символов “а” на “о”: "+text.replace("a","o"));
        System.out.println("Преобразование строки в верхний регистр: "+text.toUpperCase(Locale.ROOT));
        System.out.println("Преобразование строки в нижний регистр: "+text.toLowerCase(Locale.ROOT));
    }
}