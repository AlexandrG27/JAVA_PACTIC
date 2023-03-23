package Homework4_1.Homework4_1_10;
public class Car extends Transport
{
    public Car(int speed, int fuel, int priceFuel, double cargoRate)
    {
        super(speed, fuel, priceFuel, cargoRate);
    }
    @Override
    public double getCargoRate()
    {
        return super.getCargoRate();
    }
    @Override
    public int getFuel()
    {
        return super.getFuel();
    }
    @Override
    public int getPriceFuel()
    {
        return super.getPriceFuel();
    }
    @Override
    public int getSpeed()
    {
        return super.getSpeed();
    }
    @Override
    public String toString()
    {
        return "Car";
    }
}