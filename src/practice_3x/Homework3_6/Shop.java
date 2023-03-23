package Practice_3X.Homework3_6;
public enum Shop
{
    Apple(20),Banana(60),Watermelon(15);
    private double price;
    private String currency="₽";
    Shop(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }
    public String toString()
    {
        return String.format("%s %.2f %s",name(),price,currency);
    }
}