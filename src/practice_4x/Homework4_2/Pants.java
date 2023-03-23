package Practice_4X.Homework4_2;
public class Pants extends Clothes implements MenClothing, WomenClothing
{
    Pants(Size size, int price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressFemale()
    {
        System.out.println("Одеть мужчину");
    }
    @Override
    public void dressWomen()
    {
        System.out.println("Одеть женщину");
    }
    public String toString()
    {
        return "Штаны. "+"размер - "+ getSize() + ", цвет - "+getColor()+", цена - " + getPrice();
    }
}
