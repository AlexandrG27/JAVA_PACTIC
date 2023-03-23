package Practice_31X.main;
public class TestCalculator
{
    public void test()
    {
        Calculator calculator=new Calculator();
        int sum=calculator.calc(7,7);
        Assert.assertEquals(14,sum);
    }
}
