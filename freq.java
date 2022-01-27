import java.util.*;
public class freq 
{
    public static void main(String args[])
    {
        int f=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:\n");
        String str=obj.nextLine();
        System.out.println("Enter the character to be searched:\n");
        char a=obj.next().charAt(0);
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(a==str.charAt(i))
            {
                System.out.println("The char is found at: "+(i+1));
                f++;
            }
        }
        System.out.println("The frequency is: "+f);    
    }
    
}
