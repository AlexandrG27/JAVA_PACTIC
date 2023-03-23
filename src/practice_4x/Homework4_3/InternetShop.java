package Practice_4X.Homework4_3;
import java.util.*;
import java.util.Scanner;
public class InternetShop
{
    public static List<Product> basket = new ArrayList<>();
    public static String login="admin";
    public static String password="admin";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String index;
        Product[] phone={new Phone("смартфон","IPhone",140000),
                new Phone("смартфон","Xiaomi",69900),
                new Phone("смартфон","Samsung",75000)};
        Product[] computer={new Computer("игровой компьютер","Acer",120000),
                new Computer("офисный компьютер","Lenovo",99900),
                new Computer("ноутбук","Huawei",64890)};
        Product[] tv={new Tv("LCD-телевизор","Sony",520000),
                new Tv("LED-телевизор","Samsung",75500),
                new Tv("PDP-телевизор","Panasonic",45700)};
        Catalog.PHONE.setCatalog(phone);
        Catalog.COMPUTER.setCatalog(computer);
        Catalog.TV.setCatalog(tv);
        login();
        while (true)
        {
            System.out.println("Выберите номер каталога. Чтобы выйти введите: e. Чтобы оплатить покупки введите: buy.");
            for (Catalog catalog:Catalog.values())
            {
                System.out.println(catalog.ToString()+" ");
            }
            index=input.nextLine();
            if(index.equals("e"))
                break;
            if(index.equals("buy"))
            {
                buyBasket();
                continue;
            }
            int i=Integer.parseInt(index);
            Catalog catalog=Catalog.values()[i];
            switch (catalog)
            {
                case TV:
                    System.out.println("Введите номер товара, который хотите добавить в корзину, чтобы вернуться введите - e");
                    catalog.printCatalog();
                    buyProduct(tv);
                    continue;
                case PHONE:
                    System.out.println("Введите номер товара, который хотите добавить в корзину, чтобы вернуться введите - e");
                    catalog.printCatalog();
                    buyProduct(phone);
                    continue;

                case COMPUTER:
                    System.out.println("Введите номер товара, который хотите добавить в корзину, чтобы вернуться введите - e");
                    catalog.printCatalog();
                    buyProduct(computer);
            }
        }
    }
    public static void login()
    {
        Scanner input = new Scanner(System.in);
        while (true)
        {
            System.out.print("Введите имя пользователя: ");
            String log=input.nextLine();
            System.out.print("Введите пароль: ");
            String pass=input.nextLine();
            if (!log.equals(login))
            {
                System.out.println("Пароль или имя пользователя введены не правильно!");
            }
            else if (!pass.equals(password))
            {
                System.out.println("Пароль или имя пользователя введены не правильно!");
            }
            else break;
        }
    }
    public static void printBasket()
    {
        System.out.print("В вашей корзине: ");
        for (int i=0;i<basket.size(); i++)
        {
            System.out.print(basket.get(i).getAnnotation()+" "+basket.get(i).getName()+"; ");
        }
    }
    public static void buyBasket()
    {
        if(basket.size()>0)
        {
            int sum=0;
            printBasket();

            for (int i=0;i<basket.size(); i++)
            {

                sum+=basket.get(i).getPrice();
            }
            System.out.println("\n"+"К оплате: "+sum+" руб");
            basket.clear();
        }
        else
            System.out.println("Ваша корзина пуста");
    }
    public static void buyProduct(Product[] list)
    {
        while(true)
        {
            Scanner input = new Scanner(System.in);
            String index;
            index=input.nextLine();
            if (!index.equals("e")&&!index.equals("buy"))
            {
                int i=Integer.parseInt(index);
                basket.add(list[i]);
                printBasket();
                System.out.println("\n"+"Введите-buy, чтобы купить");
            }
            else if (index.equals("buy"))
            {
                buyBasket();
            }
            else
                break;
        }
    }
}
