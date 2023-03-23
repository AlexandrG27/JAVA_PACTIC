package Practice_4X.Homework4_4;
public class Test
{
    public static void main(String[] args)
    {
        Memory memory=new Memory("Kingston",8000,2400,8);
        Monitor monitor=new Monitor("BenQ",12000, 23,"ips",60);
        CPU cpu=new CPU("Intel",27000,3.7, 10);
        Memory memory2=new Memory("Corsair",12000,4200,16);
        Monitor monitor2=new Monitor("MSI",22000, 28,"TFT",120);
        CPU cpu2=new CPU("Ryzen",23000,4.5, 8);
        Computer computer=new Computer(brand.ASUS, memory,monitor,cpu);
        Computer computer2=new Computer(brand.ACER, memory2,monitor2,cpu2);
        Computer computer3=new Computer(brand.LENOVO,memory2,monitor,cpu2);
        System.out.println(computer.toString()+'\n');
        System.out.println(computer2.toString()+'\n');
        System.out.println(computer3.toString()+'\n');
    }
}