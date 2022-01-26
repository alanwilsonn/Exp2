import java.util.*;
public class replace 
{
 public static void main(String args[])
 {
  int i,n,r,a;
  Scanner obj=new Scanner(System.in);
  int A[]=new int[50];
  System.out.println("Enter the number of elements:\n");
  n=obj.nextInt();
  System.out.println("Enter the elements:\n");
  for(i=0;i<n;i++)
  A[i]=obj.nextInt();
  System.out.println("Enter the position to be replaced:\n");
  r=obj.nextInt();
  System.out.println("Enter the element to be added:\n");
  a=obj.nextInt();
  A[r]=a;
  System.out.println("New array:\n");
  for(i=0;i<n;i++)
  {
  System.out.println(A[i]);
  System.out.println("\t");
  }
 }
    
}
