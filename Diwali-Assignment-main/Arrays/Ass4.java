import java.util.*;
class Ass4
{
  public static void main(String []args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
         a[i]=sc.nextInt();
      }
      for(int i=0;i<n/2;i++)
      {
         int t=a[i];
         a[i]=a[n-1-i];
         a[n-1-i]=t;
      }
      for(int i=0;i<n;i++)
      {
         System.out.println(a[i]+" ");
      }
  }
}