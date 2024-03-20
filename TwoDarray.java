import java.util.Scanner;
public class TwoDarray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int marklist[][]=new int[5][5]; //2D array to store the marks of 5 subjects of 5 students
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the marks of 5 subjects of the "+(i+1) +"th student");
            for(int j=0;j<5;j++)
            {
                System.out.println("Enter marks:");
                marklist[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("The marks of "+(i+1)+"th student are:");
            for(int j=0;j<5;j++)
            {
               System.out.println(marklist[i][j]);
            }
        }
        obj.close();
    }
}
