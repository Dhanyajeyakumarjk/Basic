package Array;

//linear search for string
/*import java.util.Scanner;
public class elementfive          //linear search
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        String a1[]= {"Lotus","Lily","Daisy","Jasmine"};
        int c=0;
        String t= s1.nextLine();
        for(int i=0; i<a1.length; i++)
        {
            if(t==a1[i])
            {
                System.out.println("Word found");
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("Word not found");
        }
    }
}*/


//linear search for numbers
import java.util.Scanner;
public class elementfive
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        int a1[]={12,23,34,45};
        int c=0;
        int t= s1.nextInt();
        for(int i=0; i<a1.length; i++)
        {
            if(t==a1[i])
            {
                System.out.println("Number found");
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("Number not found");
        }
    }
}