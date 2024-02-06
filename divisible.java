import java.util.*;
public class divisible {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=s.nextInt();
        
        if(a%5==0 || a%11==0){
            System.out.println("the number" +" "+a+" "+"is divisible by 5 and 11 ");
        }
        else{
            System.out.println("the number" +" "+a +" "+"is not divisible by 5 and 11 ");
            
        }
    }
    
}
