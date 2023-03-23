package Homework4_1.Homework4_1_4;
public class Tester
{
    public static void main(String[] args)
    {
        int[][] arr= new int [][]
                {{2,2,2,},
                {2,2,2,},
                {2,2,2,}};
        Matrix.sum(arr);
        Matrix.printArr();
        Matrix.mul(2);
        Matrix.printArr();
    }
}
