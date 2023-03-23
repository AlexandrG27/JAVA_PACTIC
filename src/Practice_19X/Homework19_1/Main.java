package Practice_19X.Homework19_1;
import java.util.Scanner;
public class Main
{
    private static int index=-1;
    public static Users[] arr= {new Users("Заволокин", "Иван", "Сергеевич", "1234567890"),
            new Users("Бедрединов", "Роман", "Равильевич", "0000000000"),
            new Users("Азарян", "Давид", "Ноунеймович", "77777777777")};
    public static void main(String[] args) throws ExceptionTIN {
        Scanner input =new Scanner(System.in);
        while (true)
        {
            System.out.println("Введите ФИО");
            String surname = input.nextLine();
            findUser(surname);
            if (index==-1)
            {
                System.out.println("Пользователь с такой Фамилией не найден");
            }
            else
            {
                System.out.println("Введите ИНН");
                surname = input.nextLine();

                if (!arr[index].getTin().equals(surname))
                    throw new ExceptionTIN("ИНН введен не верно "+surname);
                else
                {
                    System.out.println("Данные введены верно");
                    break;
                }
            }
        }
    }
    private static void findUser(String surname)
    {
        String [] split=surname.split(" ");
        for (int i=0;i< arr.length;i++)
        {
            if (split[0].equals(arr[i].getSurname()))
            {
                if((arr[i].getName().equals(split[1]))&&(arr[i].getMidName().equals(split[2])))
                {
                    index=i;
                    break;
                }
                else
                    System.out.println("Пользовтель не найден");
            }
        }
    }
}
