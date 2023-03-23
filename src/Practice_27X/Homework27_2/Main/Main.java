package Practice_27X.Homework27_2.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Main
{
    public static void main(String[] args)
    {
        Map<String, String> map=createMap();
        getSameFirstNameCount(map);
        getSameLastNameCount(map);
    }
    public static void getSameLastNameCount (Map map)
    {
        int numberOfName=0;
        int buf=0;
        ArrayList<String> value = new ArrayList<>(map.values());
        int size = value.size();
        for (int i=0; i<size; )
        {
            if (buf>1)
                numberOfName+=buf;
            buf=0;
            String b=value.get(i);
            while(value.indexOf(b)!=-1)
            {
                buf++;
                value.remove(value.indexOf(b));
                size--;
            }
        }
        if (buf>1)
            numberOfName+=buf;
        System.out.println("Людей с одинаковыми именами: "+numberOfName);
    }
    public static void getSameFirstNameCount (Map map)
    {
        int numberOfSurname=0;
        int buf=0;
        ArrayList<String> key = new ArrayList<>(map.keySet());
        int size =key.size();
        for (int i=0; i<size;)
        {
            if (buf>1)
                numberOfSurname+=buf;
            buf=0;
            String b=key.get(i);
            while(key.indexOf(b)!=-1)
            {
                buf++;
                key.remove(key.indexOf(b));
                size--;
            }
        }
        if (buf>1)
            numberOfSurname+=buf;
        System.out.println("Людей с одинаковыми фамилиями: "+numberOfSurname);
    }
    public static Map createMap()
    {
        Map<String, String> map = new HashMap<String,String>();
        map.put("Азарян", "Давид");
        map.put("Пупкин", "Пупок");
        map.put("Матроскин", "Кот");
        map.put("Азарян", "Никита");
        map.put("Бедрединов", "Роман");
        map.put("Пушкин", "Александр");
        map.put("Ультра мега супер", "Хорош");
        map.put("Заволокин", "Иван");
        map.put("Валеев", "Иван");
        map.put("Лягов", "Иван");
        return map;
    }
}