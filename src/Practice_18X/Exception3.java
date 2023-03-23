package Practice_18X;
public class Exception3
{
    public static void main(String[] args)
    {
        String key=null;
        String msg = getDetails(key);
        System.out.println(msg);
    }
    public static String getDetails(String key)
    {
        try
        {
            if(key == null)
            {
                throw new NullPointerException("null key in getDetails" );
            }
        }
        catch (Exception exception)
        {
            System.out.println("Сообщение об ошибке ");
        }
        return "data for" + key;
    }
}
