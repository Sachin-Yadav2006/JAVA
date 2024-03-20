import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=1;
        int d;
        int n;
        System.out.println("Enter the number of terms to be printed:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        for(int i=0;i<n;i++)
        {
            d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    obj.close();
    
    }
}
