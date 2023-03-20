package Ex2.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Booktest {
    public static void main(String[] args) {
        int year = 0, i = 0;
        String name_book = "0", avtor = "0";
        String b;
        List<Integer>mass = new ArrayList<Integer>();
        Book a = new Book();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Имя автора: ");
            avtor = in.nextLine();
            System.out.println("Название книги: ");
            name_book = in.nextLine();
            System.out.println("год: "); year = in.nextInt();
            i++;mass.add(year);
            System.out.println("Продолжаем ввод книг?");
            b = in.next();
            if (b.equals("нет"))
            {
                System.out.println("Книг в полке " + a.Polka(i));
                System.out.println(a.year_book(mass));
                System.out.println(a.vosrast(mass));
                break;
            }
        }
    }
}