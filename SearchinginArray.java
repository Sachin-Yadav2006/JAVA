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
        int flag=0;
        for(int j=0;j<n;j++)
        {
            if(el==array[j]){
                flag=1;
            System.out.println("Element found at index "+j);
            break;
            }
        }
        if(flag==0)
        System.out.println("The element is not present in the array!");
        obj.close();
    }
}