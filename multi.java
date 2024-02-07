import java.util.Scanner;
public class multi
{
    public static void main (String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= s1.nextInt();
        int multi= 1;
        for(int i=1; i<=10; i++)
        {
            multi= i*a;
            System.out.println(i +"*"+ a +"="+ multi);
        }
    }
}