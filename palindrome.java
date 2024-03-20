import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome or not");
        int numb=obj.nextInt();
        int num=numb;
        int number=0;
        int digit;
        while (num>0)
        {
            digit=num%10;
            num=num/10;
            number=number*10+digit;
        }
        System.out.println("The reversed number is "+number);
        if(numb==number)
        System.out.println("The number is a Palindrome number");
        else
        System.out.println("The entered number is not a Palindrome number");
         obj.close();
    }
}
