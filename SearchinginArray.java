import java.util.Scanner;

public class SearchinginArray{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n=obj.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+"th element of the array");
            array[i]=obj.nextInt();
        }
        System.out.println("Enter the element to be searched in the array");
        int el=obj.nextInt();
        for(int j=0;j<n;j++)
        {
            if(el==array[j])
            System.out.println("Element found at index "+j);
        }
        obj.close();
    }
}