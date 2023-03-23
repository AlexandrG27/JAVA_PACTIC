package Practice_2X.Homework2_8;
import java.util.*;
import java.util.Scanner;
public class Homework2_8
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> line = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        System.out.println("Первоначальный массив: " + Arrays.toString(line.toArray()));
        for (int i=0; i<line.size(); i++){
            for (int j=i; j<line.size(); j++){
                Collections.swap(line, i, j);
            }
        }
        System.out.println("Конечный массив: "+Arrays.toString(line.toArray()));
    }
}
