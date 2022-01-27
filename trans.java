import java.util.*;
public class trans 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i,j,r,c;
        int A[][]=new int[25][25];
        int T[][]=new int[25][25];
        System.out.println("Enter the order of matrix:\n");
        r=obj.nextInt();
        c=obj.nextInt();
        System.out.println("Enter the elements:\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                 T[i][j]=A[j][i];
            }
        }
        System.out.println("Transposed matrix is:\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)

            {
              System.out.println(T[i][j]+"\t");
            }
        }
    }
    
}
