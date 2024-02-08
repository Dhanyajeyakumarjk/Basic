package Array;

import java.util.Scanner;
public class minmax
{
    public static void main(String[] args)
    {
        int a[] = new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter " + a.length + " elements: ");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = s1.nextInt();
        }
        int max= a[0];
        for(int i = 0; i < a.length; i++)
        {
            if(a[i]>max)
                max= a[i];
        }
        int min= a[0];
        for(int i = 0; i < a.length; i++)
        {
            if(a[i]<min)
                min= a[i];
        }
        System.out.println("The maximum array elemnt is: "+max);
        System.out.println("The minimum array elemnt is: "+min);
    }
}