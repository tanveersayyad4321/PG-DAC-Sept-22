import java.util.*;
class Ass9
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no of elements");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
        if(i%2==0)
           System.out.print((int)Math.pow(i,2)+" ");
        else
           System.out.print((int)Math.pow(i,3)+" ");
     }
   }
}