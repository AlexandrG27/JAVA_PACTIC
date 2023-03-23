package Practice_2X.Homework2_7;
public class BookTest
{
    public static void main(String[] args)
    {
        Book book1 = new Book("Ivan", "Computers", 2000);
        Book book2 = new Book("Roman", "Gay", 1998);
        Book book3 = new Book("Andrey", "science", 2003);
        Book book4 = new Book("Valera", "Machines", 2000);
        Book book5 = new Book("Teacher", "Lesson", 1997);
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.addBook(book1);
        bookShelf.addBook(book3);
        bookShelf.addBook(book2);
        bookShelf.addBook(book4);
        bookShelf.addBook(book5);
        System.out.println("Книга с самым ранним изданием"+"\n"+bookShelf.lateBook().ToString()+"\n");
        System.out.println("Книга с самым поздним изданием"+"\n"+bookShelf.oldBook().ToString()+"\n");
        bookShelf.sortBook();
    }
}