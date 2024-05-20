import java.util.Scanner;

public class typeconversions {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter which out of the following data type you want to change:\n1.Integer\n2.Float\n3.Char\n4.Double\n");
        int choice;
        choice=obj.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the integer value:");
                int num=obj.nextInt();
                System.out.println("The conversion of the integer entered is \n Float "+ (float)num);
                System.out.println("Double: "+ (double)num);
                System.out.println("Character: "+ (char)num);
                break;
            case 2:
                System.out.println("Enter the float value :");
                float num1=obj.nextFloat();
                System.out.println("The conversion of the float value entered is :\n"+(int)num1);
                System.out.println("Double: "+ (double)num1);
                System.out.println("Character "+ (char)num1);
                break;
            case 3:
                System.out.println("Enter the Character: ");
                char ch=obj.next().charAt(0);
                System.out.println("The conversion of the character entered is \n Integer:"+(int)ch);
                System.out.println("Float :"+(float)ch);
                System.out.println("Double :"+(double)ch);
                break;
            case 4:
                System.out.println("Enter the Double value:");
                double n=obj.nextDouble();
                System.out.println("The Conversion of the entered double value is \n Integer:"+(int)n);
                System.out.println("Float: "+(float)n);
                System.out.println("Char : "+ (char)n);
                break;
            default:
                System.out.println("Please enter the correct input");
                break;

        }
        obj.close();
    }
}

