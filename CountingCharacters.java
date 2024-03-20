import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter the string :");
        Scanner obj=new Scanner(System.in);
        str=obj.nextLine();
        int n=str.length();
        System.out.println("The number of characters in the string entered is "+n);
        obj.close();
    }
}
