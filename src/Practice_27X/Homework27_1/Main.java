package Practice_27X.Homework27_1;
import java.util.HashSet;
import java.util.TreeSet;
public class Main
{
    public static void main(String[] args)
    {
        HashSet set = new HashSet();
        set.add(1);
        set.add(65);
        set.add(3);
        set.add(5);
        System.out.println("Структура HashSet: " + set);
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(set);
        System.out.println("Структура TreeSet"+treeSet);
    }
}