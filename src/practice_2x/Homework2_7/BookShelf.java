package Practice_2X.Homework2_7;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class BookShelf
{
    private Book[] books = {};
    private int BooksCount = 0;
    private int IndexBook=0;
    BookShelf(int BooksCount)
    {
        books=new Book[BooksCount];
        this.BooksCount=BooksCount;
    }
    public void addBook(Book book)
    {
        books[IndexBook]=book;
        IndexBook++;
    }
    public Book lateBook ()
    {
        Book lateBook = new Book ("none", "none", 0);

        for(int i=0; i<books.length; i++)
        {

            if (books[i].getYear()> lateBook.getYear())
            {
                lateBook=books[i];
            }
        }
        return lateBook;
    }
    public Book oldBook ()
    {
        Book oldBook = lateBook();

        for(int i=0; i<books.length; i++)
        {

            if (books[i].getYear()< oldBook.getYear())
            {
                oldBook=books[i];
            }
        }
        return oldBook;
    }
    public void sortBook()
    {
        for (int i=0; i<books.length; i++)
        {
            Book min=books[i];
            int min_i=i;
            for (int j=i; j<books.length; j++)
            {
                if (books[j].getYear()<min.getYear())
                {
                    min=books[j];
                    min_i=j;
                }
            }
            if (i!=min_i)
            {
                Book tmp=books[i];
                books[i]=books[min_i];
                books[min_i]=tmp;
            }
        }
        System.out.println("Книги расставлены в порядке возрастания");
        for (int i=0;i<books.length; i++)
        {
            System.out.println(books[i].ToString()+"\n");
        }
    }
}
