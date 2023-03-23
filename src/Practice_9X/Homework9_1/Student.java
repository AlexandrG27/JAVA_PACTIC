package Practice_9X.Homework9_1;
public class Student
{
    public int idNumber[];
    public Student()
    {
        idNumber = new int[6];
        idNumber[0] = 0;
        idNumber[1] = 12;
        idNumber[2] = 15;
        idNumber[3] = 7;
        idNumber[4] = 30;
        idNumber[5] = 67;
    }
    public void selectionSort()
    {
        for (int i = 0; i < idNumber.length; i++)
        {
            int min = idNumber[i];
            int min_i = i;
            for (int j = i + 1; j < idNumber.length - 1; j++)
                if (idNumber[j] < min) {
                    min = idNumber[j];
                    min_i = j;
                }
            if (i != min_i)
            {
                int tmp = idNumber[i];
                idNumber[i] = idNumber[min_i];
                idNumber[min_i] = tmp;
            }
        }
    }
    public void PrintScr()
    {
        for (int aIdNumber : idNumber)
        {
            System.out.println(aIdNumber);
        }
    }
}