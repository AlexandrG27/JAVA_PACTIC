package Homework4_1.Homework4_1_5;
public class Reader
{
    private String fullName;
    private int number;
    private String faculty;
    private String dateOfBirth;
    private String phone;
    public Reader(String fullName, int number, String faculty, String dateOfBirth, String phone)
    {
        this.fullName = fullName;
        this.number = number;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }
    public static void takeBook(int count)
    {
        System.out.println("Петров В.В. взял "+ count+" книги");
    }

    public static void takeBook(Object...objects)
    {
        System.out.print("Петров В.В. взял книги: ");
        for (Object o : objects)
            System.out.print(o.toString()+" ");
        System.out.println("\n");
    }
    public static void returnBook(Object...objects)
    {
        System.out.print("Петров В.В. вернул книги: ");
        for (Object o : objects)
            System.out.print(o.toString()+" ");
    }
}
