package Array;

//Program to check if an Array of integers contains only odd numbers in Java?
public class oddposonly
{
    public static void main(String[] args)
    {
        int a[]={12,23,34,45,5,10};
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}