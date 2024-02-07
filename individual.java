import java.util.Scanner;
public class individual
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= s1.nextInt();
        int sum= 0;
        int r;
        while (n>0)
        {
            r= n%10;
            sum= sum+r;
            n=n/10;
        }
        System.out.println("The sum of individual number is:" +sum);
    }
}