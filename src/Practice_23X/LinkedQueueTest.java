package Practice_23X;
public class LinkedQueueTest
{
    public static void main(String[] args)
    {
        LinkedQueue<String> list=new LinkedQueue<>();
        list.add("Иван");
        list.add("Роман");
        list.add("Давид");
        for(String lin:list)
        {
            System.out.println(lin);
        }
    }
}
