import java.util.Scanner;
public class sumavg
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the number:");
         int sum= 0;
        for(int i=0; i<=3; i++)
        {
            int n= s1.nextInt();
            sum= sum+n;
        }
        double avg= sum/3;
        System.out.println("Average is: "+avg);
    }
}