package Array;

//Write Java program to Swap first and last elements of an Array.
public class swap
{
    public static void main(String[] args)
    {
        int a[]={12,23,34,45,5,10};
        int b= a[0];
        a[0]= a[a.length-1];
        a[a.length-1]=b;
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}