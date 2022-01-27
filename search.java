import java.util.*;
public class search 
{
    public static void main(String args[])
    {
        int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:\n");
        String st=obj.nextLine();
        System.out.println("Enter the character to be searched:\n");
        char c=obj.next().charAt(0);
        int len=st.length();
        for(i=0;i<len;i++)
        {
            if(c==st.charAt(i))
            {
                System.out.println("Character at: "+(i+1));
            }
            
        }
        if(i==len)
        {
            System.out.println("Character not found");
        }

        
    }
    
}
