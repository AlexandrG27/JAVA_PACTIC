package Homework4_1.Homework4_1_9;
public abstract class Furniture
{
    private String type;
    private String material;
    public Furniture(String type, String material)
    {
        this.type = type;
        this.material = material;
    }
    abstract int getPrice();

    public String getMaterial()
    {
        return material;
    }
    @Override
    public String toString()
    {
        return type+" "+ material;
    }
}