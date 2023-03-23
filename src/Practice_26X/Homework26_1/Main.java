package Practice_26X.Homework26_1;
import java.util.HashMap;
import java.util.Map;
public class Main
{
    public static void main(String[] args)
    {
        Map<Integer, String> student = new HashMap<Integer, String>();
        student.put(7,"Гилас Александр");
        student.put(2,"Никонов Роман");
        student.put(1,"Миха Давид");
        System.out.println(student.get(7));
        student.remove(7);
        System.out.println(student.get(7));
    }
}
