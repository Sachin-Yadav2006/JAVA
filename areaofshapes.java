import java.util.Scanner;
public class areaofshapes {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Choose one of the following shapes to find the area of :\n1.Circle\n2.Rectangle\n3.Square\n4.Parallelogram\n5.Triangle");
        int choice=obj.nextInt();
        double area1;
        float base,height;
        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                float radius=obj.nextFloat();
                area1=3.14*radius*radius;
                System.out.println("The area of the circle is : "+ area1);
                break;
            case 2:
                System.out.println("Enter the length and breadth of the rectangle:");
                float length=obj.nextFloat();
                float breadth=obj.nextFloat();
                area1=length*breadth;
                System.out.println("The area of the rectangle is :"+ area1);
                break;
            case 3:
                System.out.println("Enter the side of the square:");
                float side=obj.nextFloat();
                area1=side*side;
                System.out.println("The area of the rectangle is :"+ area1);
                break;
            case 4:
                System.out.println("Enter the base and height of the parallelogram:");
                base=obj.nextFloat();
                height=obj.nextFloat();
                area1=base*height;
                System.out.println("The area of the parallelogram is :"+ area1);
                break;
            case 5:
                System.out.println("Enter the base and height of the triangle:");
                base=obj.nextFloat();
                height=obj.nextFloat();
                area1=0.5*base*height;
                System.out.println("The area of the rectangle is :"+ area1);
                break;
            default:
                System.out.println("Please enter correct input");
                break;
        }
        obj.close();
    }
}
