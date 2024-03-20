import java.util.Scanner;

public class adjacentvowels {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=obj.nextLine();
        str=str+" ";
        int len=str.length();
        char ch;
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U'){
                ch=str.charAt(i+1);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U')
                {
                    ch=str.charAt(i-1);
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U'){
                        ch=str.charAt(i+1);
                        System.out.print(ch);
            
                    }
                    else{
                        System.out.print(str.charAt(i));
                        System.out.print(str.charAt(i+1));
                    }
                }
            }
            else
            {
                System.out.print(" ");
            }
        }
        obj.close();
    }
}
