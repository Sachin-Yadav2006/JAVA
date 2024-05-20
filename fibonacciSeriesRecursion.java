import java.util.Scanner;

class Fibonacci {
    // public static void main(String[] args) {
    // System.out.println(" ");
    // }
    int Fibonaccisr(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            return Fibonaccisr(n - 1) + Fibonaccisr(n - 2);
        }
    }
}

public class fibonacciSeriesRecursion {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number which Fibonacci term which you want to be shown:");
        int n = obj.nextInt();
        Fibonacci f = new Fibonacci();
        // System.out.println(" "+f.Fibonaccisr(n));
        System.out.printf(" The Fibonacci series terms is : ");
        for (int j = 1; j <= n; j++) {
            System.out.print(" " + f.Fibonaccisr(j));

        }
        obj.close();
    }
}
