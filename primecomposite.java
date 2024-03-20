import java.util.Scanner;
public class primecomposite {
    public static void main(String[] args) {
        System.out.println("Enter the number to check if it is prime or composite:");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int check=0;
        if(num==0||num==1){
            System.out.println("The entered number is neither prime nor composite");
        }
        else{
            for(int i=2;i<num;i++)
            {
            if(num%i==0)
            {
                check=1;
                System.out.println("The number entered is a composite number");
                break;
            }
            }
            if(check==0)
             System.out.println("The number entered is a prime number");
        
        }
        obj.close();
    }
}
