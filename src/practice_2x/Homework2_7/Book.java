package Practice_2X.Homework2_7;
public class Book
{
    private String Author=" ";
    private String Title=" ";
    private int Year=0;
    Book(String Author,String Title, int Year)
    {

        this.Author=Author;
        this.Title=Title;
        this.Year=Year;
    }
    public void setAuthor(String Author)
    {
        this.Author=Author;
    }
    public void setTitle(String Title)
    {
        this.Title=Title;
    }
    public void setYear(int Year)
    {
        this.Year=Year;
    }
    public String getAuthor()
    {
        return Author;
    }
    public String getTitle()
    {
        return Author;
    }
    public int getYear()
    {
        return Year;
    }
    public String ToString()
    {
        return "Название книги:"+Title+"\n"+ "Автор:" +Author+"\n"+ "Год издания:"+Year;
    }
}
