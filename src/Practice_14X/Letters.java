package Practice_14X;
public class Letters
{
    private char name;
    private double count;

    public Letters(char name, int count)
    {
        this.name = name;
        this.count = count;
    }
    public  char getName()
    {
        return name;
    }
    public double getCount()
    {
        return count;
    }
    public void setCount()
    {
        this.count+=1;
    }
    @Override
    public String toString()
    {
        return  "Буква "+ name + " - "+count;
    }
}
