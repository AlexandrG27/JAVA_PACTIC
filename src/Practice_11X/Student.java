package Practice_11X;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Student
{
    public String name;
    public Date date;
    public Student(String name, Calendar date)
    {
        this.name = name;
        this.date=date.getTime();
    }
    public void print()
    {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("Format 1: "+ name+" "+ dateFormatter.format(date));
        dateFormatter = new SimpleDateFormat("EEEE, MMMM d,yyyy");
        System.out.println("Format 2: "+name +" "+ dateFormatter.format(date));
    }
}