package Practice_14X;
import java.util.Arrays;
interface Filter
{
    boolean apply(Object o);
}
public class Main
{
    public static Object[] filter(Object[] array, Filter filter)
    {
        int offset = 0;

        for(int i = 0; i< array.length; i++)
        {
            if(!filter.apply(array[i])){
                offset++;
            }
            else
            {
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }
    public static void main(String[] args) {
        String array[] =
                new String[]{"Ivan ", "Roman", "David", "57", "Egor"};
        for (int i =0; i<array.length;i++)
            System.out.println("Текущий массив "+array[i]);

        String[] newArray =  (String[]) filter(array, new Filter()
        {
            @Override
            public boolean apply(Object o)
            {
                return o != "57";
            }
        });
        for (int i =0; i<newArray.length;i++)
            System.out.println("Фильтрованный массив "+newArray[i]);
    }
}