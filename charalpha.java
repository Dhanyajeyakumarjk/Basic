import java.util.Scanner;

public class charalpha {
    public static void main(String[] args)
    
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the character:");
        char alpha=s1.next().charAt(0);
        //System.out.println("Enter the character:"+alpha);

    
        if(alpha>='a'&& alpha<='z'||alpha>='A'&& alpha<='Z')
        {
            System.out.println("entered number is alphabet");
        }
    else if(alpha>='0' && alpha<='9')
    {
        System.out.println("entered number is a number");
    }
    else
    {
        System.out.println("entered number is a spcl character");
    }

    }
    
}
