package Homework4_1.Homework4_1_2;
public class Phone
{
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight)
    {
        this(number, model);

        this.weight = weight;
    }
    public Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
    }
    public Phone() {}
    public void receiveCall(String name, String number)
    {
        System.out.println("Звонит " + name+" номер " + number);
    }
    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }
    public String getNumber()
    {
        return number;
    }
    public void sendMessage(Object...objects)
    {
        for (Object o : objects)
            System.out.println(o.toString()+" ");
        System.out.println("----------------");
    }
    @Override
    public String toString() {
        return "Phone{" + "number='" + number + '\'' + ", model='" + model + '\'' + ", weight=" + weight + '}';
    }
}