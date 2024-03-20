import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int matrix1[][]={{1,2},{3,4}};
    int matrix2[][]={{5,6},{7,8}};
    int matrix3[][]=new int[2][2];
    int value = 0;
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            for(int k=0;k<2;k++)
            {
               value=value+matrix1[i][k]*matrix2[k][j];
            }
            matrix3[i][j]=value;
            value=0;
        }
    }
    //Printing the product matrix obtained
    System.out.println("The product matrix is:");
    for( int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print(matrix3[i][j]+"\t");
        }
        System.out.print("\n");
        
    }
    obj.close();
}
}
