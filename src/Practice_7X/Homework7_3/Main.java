package Practice_7X.Homework7_3;
public class Main
{
    public static void main(String args[])
    {
        IStringWorker stringWorker = new StringWorker();

        String testString = "I love anime";

        System.out.println(String.format("нечётные симолы: %s",stringWorker.getNewStringFromString(testString)));
        System.out.println(String.format("Инвертированный: %s",stringWorker.invertString(testString)));
        System.out.println(String.format("Кол-во символов: %s",stringWorker.countSymbols(testString)));
    }
}
