package Homework4_1.Homework4_1_9;
import java.util.List;
import java.util.Scanner;
public class FurnitureShop
{
    private List<Furniture> myList;

    public FurnitureShop(List<Furniture> myList)
    {
        this.myList = myList;
    }
    public void printFurniture()
    {
        System.out.println("Мебель в наличии: ");
        for(int i=0; i<myList.size();i++)
        {
            System.out.println(i+" "+myList.get(i).toString());
        }
    }
    public List<Furniture> getMyList()
    {
        return myList;
    }
    public void buyFurniture()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите номер товара, котоырй хотите преобрести: ");
        int index=input.nextInt();
        System.out.println("Вы приобрели "+myList.get(index).toString());
        myList.remove(index);
    }
}