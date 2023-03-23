package Practice_25X.Homework25_1;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ip адрес в десятичном виде");
        String a=input.nextLine();
        var test = Pattern.compile("^(\\d|\\d\\d|[1]\\d\\d|[2][0-4]\\d|[2][5][0-5])\\.(\\d|\\d\\d|[1]\\d\\d|[2][0-4]" +
                        "\\d|[2][5][0-5])\\.(\\d|\\d\\d|[1]\\d\\d|[2][0-4]\\d|[2][5][0-5])\\.(\\d|\\d\\d|[1]\\d\\d|[2][0-4]\\d|[2][5][0-5])$")
                .matcher(a);
        if(test.find())
            System.out.println("IP - адрес, введен верно");
        else System.out.println("IP - адрес, введен не верно");
    }
}
