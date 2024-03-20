import java.util.Scanner;

public class OccurenceCount {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=obj.nextLine();
        System.out.println("Enter the character to count the occurence:");
        char ch=obj.next().charAt(0);
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)==ch)
            {
                count=count+1;
            }
        }
        System.out.println("The Character "+ch+" has occured "+count+" times in the string");
        obj.close();
    }
}
