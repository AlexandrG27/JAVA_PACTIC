package Practice_1X;
public class Homework1_5
{
    public static void Task(String[] args)
    {
        for (int i=0; i<args.length; i++)
        {
            System.out.println(args[i]);
            if ( args[i].equals("-r"))
                System.out.println("REBOOT");
        }
    }
}
