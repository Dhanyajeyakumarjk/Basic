package Array;

public class duplicate
{
    public static void main(String[] args)
    {
        int a[]= {2,5,2,5,6};
        for(int i=0; i<a.length; i++)
        {
            for(int j= i+1; j<a.length; j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[j]+"\t");
                }
            }
        }

    }
}
