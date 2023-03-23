package Practice_28X;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        List<Item> order = new ArrayList<Item>();
        order.add(new Drink(70, "Coca-cola","d"));
        order.add( new Dish(120, "Pie","d"));
        List<Item> order2 = new ArrayList<Item>();
        order2.add(new Drink(120, "Pepsi","d"));
        order2.add( new Dish(100, "Pie","d"));
        List<Item> order3 = new ArrayList<Item>();
        order3.add(new Drink(12, "Pepsi","d"));
        order3.add( new Dish(100, "Pie","d"));
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addNode(order);
        internetOrder.addNode(order2);
        internetOrder.addNode(order3);
        System.out.println("Нажмите 'e', для выхода;");
        System.out.println("1 - удалить заказ");
        System.out.println("2 - удалить все заказы с одинаковым названием");
        System.out.println("3 - просмотреть все заказы");
        System.out.println("4 - просмотреть общую стоимость заказов");
        System.out.println("5 - узнать сколько раз заказали напиток или продукт");
        System.out.println("6 - добавить заказ");
        System.out.println("7 - показать все заказы");
        System.out.println("8 - показать общую сумму всех заказов");
        System.out.println("9 - удалить заказ");
        String a="";
        Scanner input=new Scanner(System.in);
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(1, order3);
        orderManager.addOrder(2, order2);
        orderManager.addOrder(3, order);
        while (!a.equals("e"))
        {
            System.out.print("_");
            a=input.nextLine();
            if (a.equals("1"))
            {
                System.out.print("Введите название заказа: ");
                System.out.println(internetOrder.deleteItem(input.nextLine()));
            }
            if (a.equals("2"))
            {
                System.out.print("Введите название заказа: ");
                System.out.println(internetOrder.deleteAllItem(input.nextLine()));
            }
            if (a.equals("3"))
            {
                internetOrder.print();
            }
            if (a.equals("4"))
            {
                internetOrder.print();
                System.out.println("Общая стоимость заказов: "+internetOrder.totalCost()+" руб.");
            }
            if (a.equals("5"))
            {
                internetOrder.print();
                System.out.print("Введите название заказа: ");
                String item=input.nextLine();
                System.out.println("Заказ "+item + " заказали "+ internetOrder.numberOfMealsOrDrinks(item)+" раза");
            }
            if(a.equals("6"))
            {
                System.out.println("Укажите название заказа");
                String b=input.nextLine();
                System.out.println("Укажите цену заказа");
                int price = input.nextInt();
                System.out.println("Укажите номер заказа");
                int c=input.nextInt();
                orderManager.addOrderPosition(c,new Drink(price, b,"d"));
            }
            if(a.equals("7"))
            {
                orderManager.printOrder();
            }
            if (a.equals("8"))
            {
                orderManager.printPrice();
            }
            if (a.equals("9"))
            {
                System.out.println("Введите номер заказа который хотите удалить");
                int x=input.nextInt();
                orderManager.deleteOrder(x);
            }
        }
    }
}
