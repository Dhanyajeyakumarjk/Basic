package Array;

public class method
{
    public static void main(String[] args)
    {
        String s1= "Hi Hello Welcome";
        String s2= "Ance";

        System.out.println(s1.charAt(5));
        System.out.println(s1.length());
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(0,3));
        System.out.println(s1.concat(s2));
        System.out.println(s1.replace('H','J'));
        System.out.println(s1.replaceAll("Hello","Hi"));
        System.out.println(s2.trim());
        System.out.println(s1.replaceFirst("Hi","Hello"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.contains("s"));
        System.out.println(s1.equals(s2));
        System.out.println(s2.isEmpty());
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.startsWith("Hi"));
        System.out.println(s1.endsWith("Welcome"));
        System.out.println();
        System.out.println();
        if(s1.compareTo(s2)>0)
        {
            System.out.println(s1+" is greater");
        }
        else
        {
            System.out.println(s1+" is smaller");
        }
    }
}
