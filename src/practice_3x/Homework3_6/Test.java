package Practice_3X.Homework3_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String currency;
        Converter converter=new Converter();
        Employee[] arr={new Employee("Ivan",120000),new Employee("Roma",8000),
                new Employee("Andrey",100000),};
        for (Shop shop:Shop.values())
        {
            System.out.println(shop.toString());
        }
        System.out.println("Чтобы изменить валюту введите её название: dollar, euro");
        currency= input.nextLine();
        for (Shop shop:Shop.values())
        {
            if(currency.equals("dollar"))
            {
                shop.setPrice(converter.roubleToDollar(shop.getPrice()));
                shop.setCurrency("$");
            }
            if(currency.equals("euro"))
            {
                shop.setPrice(converter.roubleToEuro(shop.getPrice()));
                shop.setCurrency("€");
            }
            System.out.println(shop.toString());
        }
        Report.generateReport(arr);
    }
}