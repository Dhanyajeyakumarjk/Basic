import java.util.Scanner;
public class posneg
{
    public static void main (String[] args)
    {
        Scanner s1= new Scanner(System.in);
        int post=0, neg=0, zero=0;
        char c;
        do
        {
            System.out.print("Enter a number: ");
            int a= s1.nextInt();
            if(a>0)
            {
                post= post+1;
            }
            else if (a<0)
            {
                neg= neg+1;
            }
            else
            {
                zero= zero+1;
            }
        System.out.print("Do you want to continue: Y/N" );
            c= s1.next().charAt(0);
        }
        while (c=='Y' || c=='y');
        System.out.println("Positive: " +post);
        System.out.println("Negative: " +neg);
        System.out.println("Zero: " +zero);
    }
}