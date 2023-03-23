package Practice_22X;
import java.util.ArrayList;
public class SimpleStack implements Stack {
    public static ArrayList<Double> stack=new ArrayList<>();
    @Override
    public double getStack()
    {
        return stack.get(0);
    }
    @Override
    public void push(double item)
    {

        stack.add(0,item);
    }
    @Override
    public double pop()
    {
        return stack.remove(0);
    }

}