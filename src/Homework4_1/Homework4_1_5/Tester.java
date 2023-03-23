package Homework4_1.Homework4_1_5;
public class Tester
{
    public static void main(String[] args)
    {
        Reader[] reader={new Reader("Петров В.В.", 777, "ИТ","31 февраля 2000года", "88005553535"),
                new Reader("Эдик", 727, "ИТ","1 апреля 2000года", "88556576735")};
        Book book=new Book("Энциклопедия", "Заволокин И.С");
        Book book1=new Book("Словарь", "Пупкин А.Н");
        Book book2=new Book("Приключения", "Худой Г.Г");
        Reader.takeBook(3);
        Reader.takeBook(book,book1,book2);
        Reader.returnBook(book,book1,book2);
    }
}