package Pack;
//import java.util.Scanner;

public class InsertionSort {
    public void insertionSortAsc(double array[],int size){
        int i,j;
        double key;
        for(i=1;i<size;i++)
        {
            key=array[i];
            j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
        array[j+1]=key;
        }
    }
    // public static void main(String[] args) {
    //     Scanner obj=new Scanner(System.in);
    //     double array[]=new double[10];
    //     int i;
    //     for(i=0;i<10;i++){
    //         System.out.println("Enter the elements of the array:");
    //         array[i]=obj.nextDouble();
    //     }
    //     insertionSortAsc(array,10);
    //     System.out.println("The elements of the sorted array are : \n\n");
    //     for(i=0;i<10;i++){
    //         System.out.println(array[i]);
    //     }
    //     obj.close();
    // }
}

