import java.util.Scanner;

abstract class SearchAndSort {
    abstract void BubbleSorting(int[] array);

    abstract int LinearSearch(int[] array, int key);
}

class AbstractImplementation extends SearchAndSort {
    void BubbleSorting(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    int LinearSearch(int[] array, int key) {
        int size = array.length;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }
}

public class SearchAndSortingAbstract {
    public static void main(String[] args) {
        int[] array = { 10, 12, -9, 23, 49, -6, 0, 45, 15, 46, 34, -8, 23, 44, 21, 11, 23, 45, 21, 36, 38 };
        System.out.println("The unsorted array is :  \n");
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] + " ");
        }

        AbstractImplementation abi= new AbstractImplementation();
        abi.BubbleSorting(array);
        System.out.println("\nThe sorted array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] + " ");
        }

        int key;
        System.out.println("Enter the element to be searched in the array:");
        Scanner obj=new Scanner(System.in);
        key=obj.nextInt();
        int index=abi.LinearSearch(array, key);
        if (index == -1) {
            System.out.println("The element not found in the array!!");
        } else {
            System.out.println("The element found at the index: " + index);
        }
            
        
    }
}
