import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter the two number to perform operations");
        Scanner obj=new Scanner(System.in);
        int a =obj.nextInt();
        int b =obj.nextInt();
        System.out.println("Choose one option from the following:\n1. Addition\n2. Subtraction \n3.Multiplication\n4.Division");
        int choice=obj.nextInt();
        int result;
        if(choice==1){
                result=a+b;
                System.out.println("The result of the operation performed is "+result);
        }
        else if(choice==2){
            result=a-b;
            System.out.println("The result of the operation performed is "+result);
        }
        else if(choice==3){
            result=a*b;
            System.out.println("The result of the operation performed is "+result);
        }
        else if(choice==4)
        {
                result=a/b;
                System.out.println("The result of the operation performed is "+result);
        }
        else
            System.out.println("Please enter a valid choice");
        
        obj.close();
    }
}
