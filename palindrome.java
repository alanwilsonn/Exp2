import java.util.*;
public class palindrome 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String name="";
        System.out.println("Enter the string:");
        name=obj.nextLine();
        String rev="";
        int len=name.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("Reversed string is:\n"+rev);
        if(name.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome"); 
        }
    }
}