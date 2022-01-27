import java.util.*;
public class replacechar 
{
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the string:\n");
       String s=obj.nextLine();
       System.out.println("Enter the character to be replaced:\n");
       char ch=obj.next().charAt(0);
       System.out.println("Enter the replacement character:\n");
       char r=obj.next().charAt(0);
       int len=s.length();
       for(int i=0;i<len;i++)
       {
           char p=s.charAt(i);
           if(p==ch)
           {
               s=s.replace(s.charAt(i),r);
           }
       }
       System.out.println("The new string is: "+s);
    }
    
}
