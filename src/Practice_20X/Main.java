package Practice_20X;
import java.io.*;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Integer[] arr = {9,2,11,4,5,0};
        System.out.println("Задание 1-3");
        File f = new File("");
        General general =new General<String,String,Integer>("Hello","hi", 34);
        general.Print();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f)))
        {
            oos.writeObject(general);
            General general1 = (General) ois.readObject();
            System.out.println(general1);
        } catch (IOException |ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Задание 4-5");
        MinMax obj =new MinMax<Integer>(arr);
        obj.SortMax();
        obj.SortMin();
        System.out.println("Сложение: " + Calculator.sum(15,15.9));
        System.out.println("Вычитание: " + Calculator.subtraction(1000,7));
        System.out.println("Умножение: " + Calculator.multiply(2.2,2.2));
        System.out.println("Деление: " + Calculator.divide(5,2.2));
        Integer[][] mat1= {{4,-3,3}, {1,2,1}, {1,1,2}};
        Double[][] mat2= {{-15.0}, {2.0}, {1.0}};
        Matrix matrixInt= new Matrix<Integer>(mat1);
        Matrix matrixDouble = new Matrix<Double>(mat2);
        Double[][] arr2= (Double[][]) matrixInt.mult(matrixDouble);
        System.out.println(Arrays.deepToString(arr2).replace("], ", "]\n"));
    }
}