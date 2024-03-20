import java.util.Scanner;

public class ReversingAString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string to reverse it:");
        String str = obj.nextLine();
        System.out.println("The original string is:\n" + str);
        String str1 = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println("The reversed string obtained is \n" + str1);
        obj.close();
    }
}
