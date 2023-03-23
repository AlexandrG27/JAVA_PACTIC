package Practice_2X;
import java.util.Objects;
import java.util.Scanner;
public class TestShop {
    public static void main(String[] args) {
        String Computer = "";
        Scanner input = new Scanner(System.in);
        Shop shop= new Shop();
        System.out.println("Для выхода из программы введите - exit"+"\n"+"Выберите действие: ");
        System.out.println("а - добавить компьютер");
        System.out.println("d - удалить компьютер");
        System.out.println("s - найти компьютер");
        System.out.println("list - список компьютеров");
        while (!Objects.equals(Computer, "exit"))
        {
            System.out.print("Введите команду ");
            Computer=input.nextLine();
            if (Computer.equals("a")){
                System.out.print("Введите название компьютеров через пробел: ");
                Computer=input.nextLine();
                shop.addComputer(Computer);
                Computer="None";
            }
            if (Computer.equals("s"))
            {
                System.out.print("Введите название компьютера который нужно найти: ");
                Computer=input.nextLine();
                if (shop.findComputer(Computer))
                    System.out.println("Компьютер есть в наличии");
                else
                    System.out.println("Компьютера нет в наличии ");
                Computer="None";
            }
            if (Computer.equals("d")){
                System.out.print("Введите название компьютера который нужно удалить: ");
                Computer=input.nextLine();
                shop.deletComputer(Computer);
                Computer="None";
            }
            if (Computer.equals("list")){
                System.out.println("Список компьютеров: ");
                shop.listComputer();
                Computer="None";
            }
        }
    }
}
