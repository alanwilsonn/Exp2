import java.util.*;
public class secondlargest 
{
 public static void main(String args[]) 
 {
  int i,n,j,temp;
  Scanner obj=new Scanner(System.in);
  int A[]=new int[50];
  System.out.println("Enter the number of elements:\n");
  n=obj.nextInt();
  System.out.println("Enter the elements:\n");
  for(i=0;i<n;i++)
  A[i]=obj.nextInt();
  for(i=0;i<n;i++)
  {
      for(j=0;j<n-i-1;j++)
      {
          if(A[j]>A[j+1])
          {
           temp=A[j];
           A[j]=A[j+1];
           A[j+1]=temp;
          }
      }
  }
  System.out.println("The second largest element is:"+A[n-2]);   
 }   
}
