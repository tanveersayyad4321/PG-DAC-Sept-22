import java.util.*;
class Ass20
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
     int onepointer=-1;
     for(int i=0;i<n;i++)
     {
         if(onepointer==-1 && a[i]==1)
              onepointer=i;
         if(a[i]==0 && onepointer!=-1)
         {
           a[onepointer++]=0;
           a[i]=1;
         }    
     }
     for(int i=0;i<n;i++)
         System.out.print(a[i]+" ");
  }
}