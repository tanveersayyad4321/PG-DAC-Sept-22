import java.util.*;
class Ass10
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of elements more than 2");
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
          a[i]=sc.nextInt();
       }
       int f=-1;
       if(a[0]<a[1])
           f=0;
       else if(a[0]>a[1])
           f=1;
       for(int i=2;i<n;i++)
       {
           if(a[i]<a[i-1] && f==0){
                 f=-1;
                 break;
           }
           if(a[i]>a[i-1] && f==1)
           {
                 f=-1;
                 break;
           }
       }
       if(f==1)
          System.out.println("Descending");
       else if(f==0)
          System.out.println("Ascending");
       else
          System.out.println("Either equal and Random");
   }
}