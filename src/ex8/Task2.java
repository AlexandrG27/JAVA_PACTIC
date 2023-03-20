package ex8;

import java.util.Scanner;

public class Task2 {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Число: ");
        int g = in.nextInt();
        System.out.println(recursion(g));
    }
}