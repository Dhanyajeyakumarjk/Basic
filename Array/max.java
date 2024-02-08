package Array;

import java.util.Scanner;
public class max
{
    public static void main(String[] args) {
        int a[] = new int[5];// int c=o; initialization of position
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter " + a.length + " elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s1.nextInt();
        }
        int max= a[0];
        for(int i = 0; i < a.length; i++)
        {
            if(a[i]>max)
                max= a[i]; // next line c=i; for position of the element
        }
        System.out.println("The maximum array elemnt is: "+max);// +(c+1)
    }
}
