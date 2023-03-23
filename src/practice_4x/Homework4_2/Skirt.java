package Practice_4X.Homework4_2;
public class Skirt extends Clothes implements WomenClothing
{
    Skirt(Size size, int price, String color)
    {
        super(size, price, color);
    }
    @Override
    public void dressWomen()
    {
        System.out.println();
    }
    public String toString()
    {
        return "Юбка. "+"размер - "+ getSize() + ", цвет - "+getColor()+", цена - " + getPrice();
    }
}