import java.util.Scanner;
public class reverse
{
    public static void main (String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= s1.nextInt();
        int sum= 0;
        int r;
        while (n>0)
        {
            r= n%10;
            sum= sum*10+r;
            n= n/10;
        }
        System.out.print(sum);
    }
}