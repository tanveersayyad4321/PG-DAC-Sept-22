import java.util.*;
class Ass5
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
      int max=a[0];//Integer.MIN_VALUE
      int min=a[0];//Integer.MAX_VALUE
      for(int i=0;i<n;i++)
      {
         if(max<a[i])
            max=a[i];
         if(min>a[i])
           min=a[i];
      }
     System.out.println("max is: "+max+" min is:"+min);
  }
}