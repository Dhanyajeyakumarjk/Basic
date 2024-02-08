package Array;

//Java Program to Count the Number of Digits in a Number
import java.util.Scanner;
public class count
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number:");
        int a= s1.nextInt();
        while(a!=0)
        {
            a= a/10;
            count++;
        }
        System.out.print(count);
    }
}