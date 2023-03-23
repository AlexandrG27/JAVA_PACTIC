package Practice_6X.Homework6_2;
public class Main
{
    public static void main(String[] args)
    {
        Printable[] print ={new Book ("Евангелион"),new Shop("Правда"),
                new Book ("Война и мир"),new Book ("Му-му"),new Shop("Красная звезда"),new Shop("Москвичка"),};
        for(Printable pr:print)
            pr.print();
    }
}