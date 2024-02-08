import java.util.*;
public class checkequal {
    public static void main(String[] args){
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter firstnumber:");
        int a=s2.nextInt();
        System.out.println("firstnumber:"+a);
        System.out.println("Enter secondnumber:");
        int b=s2.nextInt();
        System.out.println("Secondnumber:"+b);
        System.out.println("Enter third number:");
        int c=s2.nextInt();
        System.out.println("thirdnumber:"+c);
        if(a==b && b==c && c==a){
            System.out.println("All are equal");
        }
else if(a==b || b==c || c==a){
    System.out.println("Any two are equal");
}
else{
    System.out.println("Not equal");
}


    }
    
}
