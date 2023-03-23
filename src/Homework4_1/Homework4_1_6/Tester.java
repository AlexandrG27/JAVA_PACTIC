package Homework4_1.Homework4_1_6;
public class Tester
{
    public static void main(String[] args)
    {
        Manager manager=new Manager("Гилас","Александр", 110000,30000);
        Employer employer=manager;
        Employer[] arr={ new Employer("Пушкин","Александр",25000),
                new Manager("Толстой","Тигр",30000, 880.250),
                new Manager("Есенин","Сергей",2000, 943.65),};
        for (Employer emp:arr)
        {
            System.out.println(emp.getIncome());
        }
    }
}