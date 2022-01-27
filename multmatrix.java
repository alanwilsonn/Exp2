import java.util.*;
public class multmatrix 
{
  public static void main(String args[])
  {
      int i,j,k,r,c,m,n;
      Scanner obj=new Scanner(System.in);
      int A[][]=new int[25][25];
      int B[][]=new int[25][25];
      int M[][]=new int[25][25];
      System.out.println("Enter the order of first matrix:\n");
      r=obj.nextInt();
      c=obj.nextInt();
      System.out.println("Enter the order of second matrix:\n");
      m=obj.nextInt();
      n=obj.nextInt();
      if(c==m)
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
      for(i=0;i<r;i++)
      {
          for(j=0;j<n;j++)
          {
              M[i][j]=0;
              for(k=0;k<c;k++)
              {
                  M[i][j]+=A[i][k]*B[k][j];
              }
          }
      }
      System.out.println("Resultant matrix:\n");
      for(i=0;i<r;i++)
      {
          for(j=0;j<n;j++)
          {
              System.out.println(M[i][j]+"\t");
          }

      }
    }
    else
    {
      System.out.println("Multiplication not possible");
    }
  }
}
