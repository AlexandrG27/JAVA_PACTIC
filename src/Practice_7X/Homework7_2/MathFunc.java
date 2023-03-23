package Practice_7X.Homework7_2;
public class MathFunc implements MathCalculable
{
    public float getPi()
    {
        return 3.14f;
    }
    public double riseToADegree(double number, double degree)
    {
        if(degree == 0)
            return 1;

        double result = number;

        for(int counter = 0; counter < degree; counter++)
        {
            result *= number;
        }
        return result;
    }
    public double countComplexNumber(double a, double b)
    {
        double number1 = riseToADegree(a,2);
        double number2 = riseToADegree(b,2);
        return Math.sqrt((number1 + number2));
    }
}