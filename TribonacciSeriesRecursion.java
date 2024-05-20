import java.util.Scanner;

public class TribonacciSeriesRecursion {
    static double Tribonacci(double n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1.0;
        } else if (n == 3) {
            return 0;
        } else {
            return Tribonacci(n - 3) + Tribonacci(n - 2) + Tribonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the term of Tribonacci series :");
        Scanner obj = new Scanner(System.in);
        double n = obj.nextInt();
        System.out.printf("The Tribonacci series %dth term is :", (int) n);
        System.out.println(Tribonacci(n));
        obj.close();
    }
}
