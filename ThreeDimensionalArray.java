//To store the ascii characters in a 3-dimensional array of dimensions 446/464/644 and print the characters.

import java.util.Scanner;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char array[][][] = new char[4][4][6];
        System.out.println("Enter the characters to be stored in the array");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    array[i][j][k] = sc.next().charAt(0);
                }
            }
        }

        System.out.println("The elements of the array are : ");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                System.out.print("{");
                for (int k = 0; k < 6; k++) {
                    System.out.print(" " + array[i][j][k] + "");
                }
                System.out.print("}");
            }
        }
    }
}
