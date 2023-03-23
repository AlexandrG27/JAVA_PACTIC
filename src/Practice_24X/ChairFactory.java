package Practice_24X;
public class ChairFactory
{
    public static SuperChair getChair(String type, String material, String legs, String back)
    {
        if("Викторианский".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else if ("Универсальный".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else if ("Магический".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else
            return null;
    }
}
