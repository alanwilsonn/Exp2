import java.util.*;
public class sum 
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  int i,n,sum=0;
  System.out.println("Enter the number of elements:\n");
  n=obj.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the elements:\n");
  for(i=0;i<n;i++)
  {
      a[i]=obj.nextInt();

  }
  for(i=0;i<n;i++)
  {
      sum+=a[i];
  }
  System.out.println("The sum of"+n+"elements in an array="+sum);
 }   
}
