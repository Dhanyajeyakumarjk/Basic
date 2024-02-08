package Array;

//print character at odd position
public class charoddpos
{
    public static void main(String[] args)
    {
        String s1= new String("java programming");

        for(int i=0; i<=s1.length()-1; i++)
        {
            if(i%2!=0)
            {
                System.out.print(s1.charAt(i)+ " ");
            }
        }
    }
}