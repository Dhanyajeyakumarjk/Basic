import java.util.Scanner;
public class Arms {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the armstrong number:\t");
        int n=s.nextInt();
        int sum=0;
        int temp=n;
        int r;
        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("The given number is Armstrong");
        }
        else{
            System.out.println("The given number is not an Armstrong");
        }

    }

    
}
