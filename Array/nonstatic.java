package Array;

/*import java.util.Scanner;
public class nonstatic
{
    public static void main(String[] args)
    {
        nonstatic n= new nonstatic();
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a= s1.nextInt();
        int b= s1.nextInt();
        int c= s1.nextInt();
        n.Add(a,b);
        n.sub(a,b);
        n.multiply(a,b,c);
    }
    public static int Add(int a, int b)
    {
        int d=a+b;
        System.out.println("Sum= "+d);
        return d;
    }
    public static int sub(int a, int b)
    {
        int e=a-b;
        System.out.println("Subtract= "+e);
        return e;
    }
    public static int multiply(int a, int b, int c)
    {
        int f=a*b*c;
        System.out.println("Multiply= "+f);
        return f;
    }
}*/
import java.util.Scanner;
public class nonstatic
{
    public static int Add(int a, int b)
    {
        int c=a+b;
        System.out.println("Sum= "+c);
        return c;
    }
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a= s1.nextInt();
        int b= s1.nextInt();
        System.out.println(a+" "+b);
        Add(a,b);
    }
}
//non static