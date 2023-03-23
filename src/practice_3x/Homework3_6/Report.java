package Practice_3X.Homework3_6;
public class Report
{
    public static void generateReport(Employee[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.printf("%s,%15.2f,%n",arr[i].getFullName(), arr[i].getSalary());
        }
    }
}
