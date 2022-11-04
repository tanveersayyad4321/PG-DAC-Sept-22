import java.util.*;
class Ass14
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a1[]=new int[n];
       int a2[]=new int[n];
       for(int i=0;i<n;i++)
            a1[i]=sc.nextInt();
       for(int i=0;i<n;i++)
            a2[i]=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           if(a1[i]!=a2[i])
           {
                System.out.println("Not Equal");
                return;
           }
       }
       System.out.println("Equal");
   }
}