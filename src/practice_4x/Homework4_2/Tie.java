package Practice_4X.Homework4_2;
public class Tie extends Clothes implements MenClothing
{
    Tie(Size size, int price, String color)
    {
        super(size, price, color);
    }
    @Override
    public void dressFemale()
    {
        System.out.println("Одеть мужчину");
    }
    public String toString()
    {
        return "Галстук. "+"размер - "+ getSize() + ", цвет - "+getColor()+", цена - " + getPrice();
    }
}