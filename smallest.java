import java.util.*;
public class smallest 
{
  public static void main(String args[]) 
  {
   int i,n,small=0;
   int a[]=new int[25];
    Scanner obj1 = new Scanner(System.in) ;
    System.out.println("Enter the number of elements:\n");
       n=obj1.nextInt();
       System.out.println("Enter the elements:\n");
       for(i=0;i<n;i++)
       a[i]=obj1.nextInt();

   small=a[0];
   for(i=0;i<n;i++)
   {
       if(a[i]<small)
       small=a[i];
   }
   System.out.println("The smallest elements is:"+small);
  }
    
}
