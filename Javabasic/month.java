import java.util.Scanner;
public class month
{
    public static void main(String []args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Month: ");
        int aa= s1.nextInt();
        
        switch (aa)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days in month is 31");
                break;
             case 4:
             case 6:
             case 9:
             case 11:
                System.out.println("Number of days in month is 30");
                break;
            case 2:
                System.out.println("Number of days in month is maybe 28 or 29");
                break;
        }

    }
}