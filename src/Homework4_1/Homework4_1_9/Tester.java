package Homework4_1.Homework4_1_9;
import java.util.*;
public class Tester {
    public static void main(String[] args)
    {
        String index="";
        Furniture chair = new chair("стул","деревянный", 1500);
        Furniture table = new table("стол","стеклянный", 9000);
        Furniture sofa = new sofa("диван","кожанный", 79900);
        List<Furniture> furniture = new ArrayList<>();
        furniture.add(chair);
        furniture.add(table);
        furniture.add(sofa);
        FurnitureShop shop=new FurnitureShop(furniture);
        while(!index.equals("n"))
        {
            if(shop.getMyList().size()==0)
            {
                System.out.println("Извините, товара нет в наличии. Вы всё скупили.");
                break;
            }
            shop.printFurniture();
            shop.buyFurniture();

            Scanner input = new Scanner(System.in);
            System.out.println("Желаете продолжить покупки y/n ?");
            index=input.nextLine();
            if(index.equals("n"))
                break;
        }
    }
}
