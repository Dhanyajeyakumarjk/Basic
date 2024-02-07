import java.util.Scanner;
public class leapyear
{
    public static void main (String [] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("enter a year: ");
        int a= s1.nextInt();
       
        if(a%4==0 && a%100!=0)//divisible by 4
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Nota leap year");
        }
    }
}