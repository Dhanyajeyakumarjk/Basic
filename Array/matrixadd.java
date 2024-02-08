package Array;
//matrix addition
import java.util.Scanner;
public class matrixadd
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        int a= s1.nextInt();
        int b= s1.nextInt();
        int [][] a1= new int [a][b];
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
        int [][] b1= new int [a][b];
        for (int i=0; i<a;i++)
        {
            for(int j=0; j<b; j++)
            {
                b1[i][j]= s1.nextInt();
            }
        }
        for (int i=0; i<a;i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print(b1[i][j]+" ");
            }
            System.out.println();
        }
        //
        int [][] c1= new int [a][b];
        for (int i=0; i<a;i++)
        {
            for(int j=0; j<b; j++)
            {
                c1[i][j]= a1[i][j]+b1[i][j];
            }
        }
        for (int i=0; i<a;i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print(c1[i][j]+" ");
            }
            System.out.println();
        }
    }
}