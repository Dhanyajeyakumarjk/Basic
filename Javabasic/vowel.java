import java.util.Scanner;
public class vowel
{
    public static void main(String []args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Character: ");
        char aa= s1.next().charAt(0);
        System.out.println("Character is: "+aa);
        switch (aa)
        {
            case 'a':
            case 'A':
                System.out.println(aa+ " is a vowel");
                break;
            case 'e':
            case 'E':
                System.out.println(aa+ " is a vowel");
                break;
            case 'i':
            case 'I':
                System.out.println(aa+ " is a vowel");
                break;
            case 'o':
            case 'O':
                System.out.println(aa+ " is a vowel");
                break;
            case 'u':
            case 'U':
                System.out.println(aa+ " is a vowel");
                break;
            default:
                System.out.println(aa+ " is a consonant");
                break;
        }
    }
}