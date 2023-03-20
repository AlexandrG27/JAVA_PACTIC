package Ex2.Book;

import java.util.List;
import java.util.Collections;
import java.lang.*;
import java.util.stream.Collectors;

public class Book {
    public static void main(String[] args) {}
    private String avtor, name_book;
    private int year;
    private int[] mass = new int[10];
    public Book(){
        this.year = year;
        this.avtor = avtor;
        this.name_book = name_book;
    }
    public  int Polka(int i){
        return i;
    }

    public String year_book(List<Integer>mass) {
        return "Cамый раний год: " + Collections.min(mass) + "\n"  +"Самый поздний год: " + Collections.max(mass);
    }
    public String vosrast(List<Integer>mass)
    {
        mass = mass.stream().sorted().collect(Collectors.toList());
        return "Порядок возрастания: "+mass;


    }
}