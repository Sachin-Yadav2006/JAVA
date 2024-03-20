import java.util.Scanner;
public class onedarray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        float marklist[]=new float[6];
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter the subject mark");
            marklist[i]=obj.nextFloat();
            
        }
        System.out.println("The list elements are:");
        for(int j=0;j<6;j++)
        {
            System.out.println(marklist[j]+'\n');
        }
        obj.close();
        
    }
}
