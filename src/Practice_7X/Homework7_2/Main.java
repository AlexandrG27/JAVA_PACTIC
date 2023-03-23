package Practice_7X.Homework7_2;
public class Main
{
    public static void main(String args[])
    {
        MathCalculable mathFunc = new MathFunc();
        int radius = 10;
        int lengthOfCircle =  (int)(2 * radius * mathFunc.getPi());
        System.out.println(String.format("Длина круга: %s", lengthOfCircle));
    }
}
