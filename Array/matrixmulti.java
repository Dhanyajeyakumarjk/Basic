package Array;

//matrix multiplication
import java.util.Scanner;
public class matrixmulti
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        int a= s1.nextInt();
        int b= s1.nextInt();
        int [][] a1= new int [10][10];
        for (int i=0; i<a;i++)
        {
            for(int j=0; j<b; j++)
            {
                a1[i][j]= s1.nextInt();
            }
        }
        for (int i=0; i<a;i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        //
        int c= s1.nextInt();
        int d= s1.nextInt();
        int [][] b1= new int [10][10];
        for (int i=0; i<c;i++)
        {
            for(int j=0; j<d; j++)
            {
                b1[i][j]= s1.nextInt();
            }
        }
        for (int i=0; i<c;i++)
        {
            for(int j=0; j<d; j++)
            {
                System.out.print(b1[i][j]+" ");
            }
            System.out.println();
        }
        //
        int [][] c1= new int [10][10];
        for (int i=0; i<a;i++)
        {
            for(int j=0; j<d; j++)
            {
                for(int k=0; k<a ;k++)
                {
                    c1[i][j]= c1[i][j]+(a1[i][k]*b1[k][i]);
                }
            }
        }
        for (int i=0; i<a;i++)
        {
            for(int j=0; j<d; j++)
            {
                System.out.print(c1[i][j]+" ");
            }
            System.out.println();
        }
    }
}