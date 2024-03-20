import java.util.Scanner;
public class oddeven{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number to find if it is even or odd");
        int num=myObj.nextInt();
        if(num%2==0)
        System.out.println("The entered number is even");
        else
        System.out.println("The entered number is odd");
        myObj.close();
    }
}
