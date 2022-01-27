import java.util.*;
public class addmatrix 
{
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
       int i,j,r,c,m,n;
       int A[][]=new int[25][25];
       int B[][]=new int[25][25];
       int S[][]=new int[25][25];
       System.out.println("Enter order of first matrix:\n");
       r=obj.nextInt();
       c=obj.nextInt();
       System.out.println("Enter the order of second matrix:\n");
       m=obj.nextInt();
       n=obj.nextInt();
       if(r==m&&c==n)
       {
           System.out.println("Enter the elements of first matrix:\n");
           for(i=0;i<r;i++)
           {
               for(j=0;j<c;j++)
               {
                 A[i][j]=obj.nextInt();
               }
           }
           System.out.println("Enter the elements of second matrix:\n");
           for(i=0;i<m;i++)
           {
               for(j=0;j<n;j++)
               {
                   B[i][j]=obj.nextInt();
               }
           }
       } 
       else
       {
           System.out.println("Addition not possible\n");
       }
       for(i=0;i<r;i++)
       {
           for(j=0;j<c;j++)
           {
               S[i][j]=A[i][j]+B[i][j];
           }
       }
       System.out.println("Sum is:\n");
       for(i=0;i<r;i++)
       {
           for(j=0;j<c;j++)
           {
               System.out.println(S[i][j]+"\n");
               
           }
       }  
    }
}
