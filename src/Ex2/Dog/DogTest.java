package Ex2.Dog;

import java.util.Scanner;
public class DogTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dog a = new Dog();
        System.out.println("Кличка собаки: ");
        String name = in.nextLine();
        System.out.printf("Сколько лет человеку: ");
        int age = in.nextInt();
        a.name_dog(name);
        System.out.printf("%s",a.ToString(age, name));
    }
}
