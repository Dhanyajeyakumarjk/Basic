import java.util.*;
public class divisible {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=s.nextInt();
        
        if(a%8==0 || a%4==0){
            System.out.println("the number" +" "+a+" "+"is divisible by 8 and 4");
        }
        else{
            System.out.println("the number" +" "+a +" "+"is not divisible by 8 and 4 ");
            
        }
    }
    
}
