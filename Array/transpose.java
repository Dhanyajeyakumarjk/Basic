package Array;
import java.util.Scanner;
public class transpose
{
    public static void main (String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int a= s1.nextInt();
        System.out.println("Enter number of columns: ");
        int b= s1.nextInt();
        int[][] a1=  new int[a][b];
        for(int i=0; i<a; i++)
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
        for(int j=0; j<b; j++)
        {
            for(int i=0; i<a; i++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//transpose