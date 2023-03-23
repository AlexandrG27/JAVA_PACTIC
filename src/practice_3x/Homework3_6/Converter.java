package Practice_3X.Homework3_6;
public class Converter
{
    private double dollarCoef=1.0878;
    private double dollarEuro=1;
    private double dollar=60.02;
    private double euro=60.05;
    public double roubleToDollar(double price)
    {
        return price/dollar;
    }
    public double dollarToRouble(double price)
    {
        return price*dollar;
    }
    public double roubleToEuro(double price)
    {
        return price/euro;
    }
    public double duroToRouble(double price)
    {
        return price*euro;
    }
    public double dollarToEuro(double price)
    {
        return price*dollarCoef;
    }
    public double euroToDollar(double price)
    {
        return price/dollarCoef;
    }
}
