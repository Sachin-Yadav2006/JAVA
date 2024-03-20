import java.util.Scanner;
public class patternprinting{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of lines to be printed:");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        obj.close();
    }
}