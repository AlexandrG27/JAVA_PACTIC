package Practice_2X;
import java.util.ArrayList;
import java.util.List;
public class Shop {
    private List<String> computerShop= new ArrayList<String>();
    public void addComputer(String computer){
        String[] words = computer.split(" ");
        for (int i=0; i< words.length; i++)
        {
            computerShop.add(words[i]);
        }
    }
    public boolean findComputer(String name)
    {
        return computerShop.contains(name);
    }
    public void deletComputer(String name)
    {
        for (int i=0; i<=computerShop.size(); i++)
        {
            if (computerShop.get(i).equals(name))
            {
                computerShop.remove(i);
                System.out.println("Компьютер удален");
                break;
            }
            if (i==computerShop.size())
                System.out.println("Компьютера нет в наличии");
        }
    }
    public void listComputer()
    {
        computerShop.forEach(System.out::println);
    }
}