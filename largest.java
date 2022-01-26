import java.util.*;
public class largest 
{
 public static void main(String args[])
 {
     int i,j,r,c,larg=0;
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter the number of rows:\n");
     r=obj.nextInt();
     System.out.println("Enter the number of columns:\n");
     c=obj.nextInt();
     System.out.println("Enter the elements:\n");
     int A[][]=new int[r][c];
     for(i=0;i<r;i++)
     {
         for(j=0;j<c;j++)
         {
             A[i][j]=obj.nextInt();
         }
     }
     larg=A[0][0];
     for(i=0;i<r;i++)
     {
        for(j=0;j<c;j++)
        {
            if(larg<A[i][j])
            larg=A[i][j];
        }
     }
     System.out.println("The largest element is:\n"+larg);

 }   
}
