package ex4_1.Manager;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя работодателя");
        String firstName = sc.nextLine();
        System.out.println("Введите фамилию работодателя");
        String lastName = sc.nextLine();
        System.out.println("Введите среднее количество отработанных дней");
        double AverageWorkDay = sc.nextDouble();
        System.out.println("Введите доход работодателя");
        double income = sc.nextDouble();
        System.out.println("Введите среднюю зарплату работодателя");
        double averageSum = sc.nextDouble();

        Employer[] type = new Employer[2];
        type[0] = new Employer(firstName,lastName,AverageWorkDay,income,averageSum);

        System.out.println("Введите имя менеджера");
        String firstName1 = sc.next();
        System.out.println("Введите фамилию менеджера");
        String lastName1 = sc.next();
        System.out.println("Введите среднее количество отработанных дней");
        double AverageWorkDay1 = sc.nextDouble();
        System.out.println("Введите доход менеджера");
        double income1 = sc.nextDouble();
        System.out.println("Введите среднюю зарплату менеджера");
        double averageSum1 = sc.nextDouble();
        type[1] = new Manager(firstName1,lastName1,AverageWorkDay1,income1,averageSum1);

        System.out.println("Доход работодателя " + firstName + " " + lastName + ": " + Employer.getIncome(AverageWorkDay, income, averageSum) + '$');
        System.out.println("Доход мэнеджера " + firstName1 + " " + lastName1 + ": " + Employer.getIncome(AverageWorkDay1, income1, averageSum1) + '$');
    }
}
