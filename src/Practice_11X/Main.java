package Practice_11X;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws ParseException
    {
        Date md=new Date();
        Calendar calendar = new GregorianCalendar(2022, 10 , 05, 9,55);
        Date date = calendar.getTime();
        System.out.println( "Разработчик: Иван Заволокин" + "\n"+"Дата получения задания: "+date);
        System.out.println("Дата сдачи задания: "+md);
        System.out.println();
        System.out.println("Введите дату в формате dd-MM-yyyy");
        Scanner input = new Scanner(System.in);
        String text= input.nextLine();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormatFull = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        md=sdf.parse(text);
        cal.setTime(sdf.parse(text));
        System.out.println("Формат Calendar: "+cal.getTime());
        Date md2=new Date();
        System.out.print("Дата введенная пользователем(Date): ");
        System.out.println(sdf.format(md)+" "+dateFormat.format(md2));
        System.out.println("Текущая дата: "+dateFormatFull.format(md2));
        Student std=new Student("Иван", calendar);
        std.print();
    }
}