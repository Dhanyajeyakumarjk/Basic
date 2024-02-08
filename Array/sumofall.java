package Array;
//Program to get the sum of all elements in an integer array in Java?
public class sumofall
{
    public static void main(String[] args)
    {
        int a[]={1,5,10};
        int sum= 0;
        for(int i=0; i<=a.length; i++)
        {
            sum= sum+a[i];
        }
        System.out.print(sum);
    }
}