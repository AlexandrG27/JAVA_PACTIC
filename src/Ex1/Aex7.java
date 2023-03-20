package Ex1;

public class Aex7 {
    public static int Factorial(int n) {
    int res = 1;
    for(int i = 1; i<=n;i++)
        res *=i;
    return res;
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
}
