package Practice_13X.Part_4;
import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String fnumber = "";
        System.out.print("Введите номер телефона в формате +7: ");
        String number = input.nextLine();
        for (int i=0; i<number.length(); i++)
        {
            fnumber = fnumber + number.charAt(i);
            if (i==1)
            {
                fnumber+="(";
            }
            if (i==4)
            {
                fnumber+=")";
            }
            if ((i==4)||(i==7))
            {
                fnumber+="-";
            }
        }
        System.out.println(fnumber);
    }
}
