import java.util.Scanner;

public class matrixaddition {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int matrix1[][]=new int[2][2];
        int matrix2[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter the element for matrix"+(i+1));
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter the element of row "+(j+1));
                for(int k=0;k<2;k++)
                {
                    if(i==0){
                        matrix1[j][k]=obj.nextInt();
                    }
                    else
                    matrix2[j][k]=obj.nextInt();
                }
            }
        }
        //Addition of matrix 1 and matrix 2
        int matrix3[][]=new int[2][2];
        for(int l=0;l<2;l++)
        {
            for(int m=0;m<2;m++)
            {
                matrix3[l][m]=matrix1[l][m]+matrix2[l][m];
            }
        }
        System.out.println("The elements of the third matrix is ");
        for(int l=0;l<2;l++)
        {
            for(int m=0;m<2;m++)
            {
                System.out.print(matrix3[l][m]+"\t");;
            }
            System.out.print("\n");
        }
        obj.close();
    }

}
