import java.lang.reflect.Array;
import Pack.InsertionSort;
class Implementation implements Interface{
    int[] countoccurence(int x[],int length){
        int arr[]=new int[length];
        
        return arr;
    }
    public void callmean(double x[]){
        double mean;
        double sum=0;
        int i;
        int length=Array.getLength(x);
        for(i=0;i<length;i++){
            sum+=x[i];
        }
        mean=sum/length;
        System.out.println("The mean  of the series is : "+ mean);
    }
    public void callmedian(double x[]){
        int length=Array.getLength(x);
        InsertionSort a=new InsertionSort();
        a.insertionSortAsc(x,length);
        if(length%2==0){
            length=length/2;
        }
        else{
            length=(length+1)/2;
        }
        System.out.println("The median of the data is :\n"+x[length]);
    }
    public void callmode(double x[]){
        System.out.println("The mode of the data entered is : \n");
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        //Declaring an array
        double array[]=new double[220];
        //Adding 10 elements of fibonacci series to the array
        double a=0,b=1;
        int i;
        double element;
        array[0]=a;
        array[1]=b;
        for(i=2;i<10;i++){
            element=a+b;
            array[i]=element;
            a=b;
            b=element;
        }
        //Adding 10 elements of the tribonacci series 
        a=0;b=1;
        double c=1;
        array[10]=a;
        array[11]=b;
        array[12]=c;
        for(i=3;i<10;i++)
        {
            element=a+b+c;
            array[10+i]=element;
            a=b;
            b=c;
            c=element;
        }
        //Adding the elements of the new series of the form x(i)=3.99*(1-x(i-1))
        a=0;
        array[20]=a;
        for(i=1;i<200;i++){
            element=3.99*(1-a);
            array[20+i]=element;
            a=element;
        }
        Implementation im=new Implementation();
        im.callmean(array);
        im.callmedian(array);
        im.callmode(array);
    }
}
