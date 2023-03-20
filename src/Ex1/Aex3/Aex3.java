package Ex1;
import java.util.*;
public class Aex3 {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = in.nextInt();
            sum += numbers[i];
        }
        double g = sum / numbers.length;
        System.out.println("Сумма введенных чисел - " + sum);
        System.out.println("Среднее арифметическое " + g);
    }
}
