import java.util.Scanner;
public class natural
{
    public static void main (String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= s1.nextInt();
        int sum= 0;
        for(int i=1; i<=a; i++)
        {
            sum= sum+i;
        }
        System.out.println(sum);
    }
}