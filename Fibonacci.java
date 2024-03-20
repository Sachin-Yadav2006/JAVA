//Printing Fibonacci series 0 1 1 2 3 5 8 13 21 ...

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        System.out.println("Enter the number of terms of the fibonacci series to be printed:");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("The required Fibonacci series are:");
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<(n-2);i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        obj.close();
    }
}