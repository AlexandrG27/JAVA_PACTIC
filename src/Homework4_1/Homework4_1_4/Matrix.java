package Homework4_1.Homework4_1_4;
public class Matrix
{
    private static  int[][] arr = new int[][]
            {{1,1,1,},
            {1,1,1,},
            {1,1,1}};
    private static int m=3;
    private  static int k=3;
    public static void sum(int[][] mat)
    {
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<k; j++)
            {
                arr[i][j]+=mat[i][i];
            }
        }
    }
    public static void mul(int value)
    {
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<k; j++)
            {
                arr[i][j]*=value;
            }
        }
    }
    public static void printArr()
    {
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<k; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}