import java.util.Scanner;
public class sumodd
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= s1.nextInt();
        int odd=0, even=0;
        for(int i=1; i<=a; i++)
        {
            System.out.println("Enter the input value:");
            int n= s1.nextInt();
        
    
            if(n%2==0)
            {
                even= even+n;
            }
            else {
                odd= odd+n;
            }
        }
        System.out.println("Sum of even number is: "+even);
        System.out.println("Sum of odd number is: "+odd);
    }
}