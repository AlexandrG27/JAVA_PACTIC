package Homework4_1.Homework4_1_2;
public class Tester
{
    public static void main(String[] args)
    {
        Phone phone=new Phone("89054557582","Xiaomi",450);
        Phone phone2=new Phone("89049434432","Samsung",560);
        Phone phone3=new Phone("89997773231","Huawei",435);
        System.out.println(phone.toString()+"\n"+phone2.toString()+"\n"+phone3.toString());
        phone.receiveCall("Иван");
        System.out.println(phone.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone2.receiveCall("Акакий", "89997777777");
        System.out.println("Сообщения будуь отправлены следующим номерам:");
        phone3.sendMessage("89342352445","89348345242","89991457390");
    }
}