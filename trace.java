import java.util.*;
public class trace 
{
    public static void main(String args[])
    {
        int i,j,r,t=0;
        Scanner obj=new Scanner(System.in);
        int A[][]=new int[25][25];
        System.out.println("Enter the order:\n");
        r=obj.nextInt();
        System.out.println("Enter the elements:\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
              A[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            t+=A[i][i];

        }
        System.out.println("Trace is:\n"+t);
    }
    
}