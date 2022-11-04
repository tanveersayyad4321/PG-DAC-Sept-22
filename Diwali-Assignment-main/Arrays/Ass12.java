import java.util.*;
class Ass12
{
   public static void main(String []args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
       System.out.println("enter the value k by which we want to rotate our array");
       int k=sc.nextInt();
       int res[]=new int[n];
       int j=0;
       for(int i=k;i<n;i++)
            res[j++]=a[i];
       for(int i=0;i<k;i++)
            res[j++]=a[i];
       for(int i=0;i<n;i++)
            System.out.print(res[i]+" ");
   }
}
