import java.util.*;
class Ass8
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
     int sum[]=new int[n];
     for(int i=0;i<n;i++)
     {
         if(i==0)
            sum[i]=a[i];
         else
            sum[i]=a[i]+sum[i-1];
     }
     if(n<3)
        return;
      for(int i=2;i<n;i++)
      {
           if(i==2)
              System.out.print(sum[i]/3+" ");
           else
              System.out.print((sum[i]-sum[i-3])/3+" ");
      }
   }
}