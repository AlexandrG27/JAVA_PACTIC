package Practice_30X;
public class Drink extends MenuItem implements Alcoholable{
    private double alcoholVol;
    private DrinkTypeEnum type;
    public Drink(int cost, String name, String description)
    {
        super(cost, name, description);
    }
    public DrinkTypeEnum getType()
    {
        return type;
    }
    @Override
    public void isAlcoholicDrink() { }
    @Override
    public double getAlcoholVol()
    {
        return alcoholVol;
    }
}
