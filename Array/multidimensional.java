package Array;

import java.util.Scanner;
public class multidimensional
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        int b= s1.nextInt();
        int c= s1.nextInt();
        int [][] a= new int [b][c];
        for (int i=0; i<b;i++)
        {
            for(int j=0; j<c; j++)
            {
                a[i][j]= s1.nextInt();
            }
        }
        for (int i=0; i<b;i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}   //multidimensional
