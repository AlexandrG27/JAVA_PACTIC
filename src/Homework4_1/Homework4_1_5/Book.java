package Homework4_1.Homework4_1_5;
public class Book
{
    private String name;
    private String author;

    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public String toString()
    {
        return name;
    }
}