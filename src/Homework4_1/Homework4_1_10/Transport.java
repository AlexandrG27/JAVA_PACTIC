package Homework4_1.Homework4_1_10;
public abstract class Transport
{
    private int speed;
    private int fuel;
    private int priceFuel;
    private double cargoRate;
    private double price_1km;
    public Transport(int speed, int fuel, int priceFuel, double cargoRate)
    {
        this.speed = speed;
        this.fuel = fuel;
        this.priceFuel = priceFuel;
        this.cargoRate = cargoRate;
        price_1km=(fuel*priceFuel)/100;
    }
    public double getPrise_1km()
    {
        return price_1km;
    }
    public int getFuel()
    {
        return fuel;
    }
    public double getCargoRate()
    {
        return cargoRate;
    }
    public int getPriceFuel()
    {
        return priceFuel;
    }
    public int getSpeed()
    {
        return speed;
    }
    @Override
    public abstract String toString();
}