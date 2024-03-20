import java.util.Scanner;
;public class ifelse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your percentage to print your grade:");
        int percentage=obj.nextInt();
        if(percentage>90 && percentage<=100)
        {
            System.out.println("Your Grade is A1");
        }
        else if(percentage>80 && percentage<=90)
        {
            System.out.println("Your Grade is A2");
        }
        else if(percentage>70 && percentage<=80)
        {
            System.out.println("Your grade is B1");
        }
        else if(percentage>60 && percentage<=70){
            System.out.println("Your Grade is B2");
        }
        else if(percentage>50 && percentage<=60){
            System.out.println("Your grade is C1");
        }
        else if(percentage>40 && percentage<=50){
            System.out.println("Your grade is C2");
        }
        else if(percentage>33 && percentage<=40)
        {
            System.out.println("Your grade is D");
        }
        else if(percentage>0 && percentage<=33)
        {
            System.out.println("You are failed");
        }
        else
        System.out.println("Please enter correct percentage");
        obj.close();
    }
}
