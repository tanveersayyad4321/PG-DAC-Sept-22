import java.util.*;
class Ass24
{
   static void sort(String a[])
   {
       int n=a.length;
       for(int i=0;i<n-1;i++)
       {
           for(int j=0;j<n-i-1;j++)
           {
               if(a[j].length()>a[j+1].length())
               {
                   String temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
       }
   }
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of String needs to be sorted");
       int n=sc.nextInt();
       sc.nextLine();
       String []a=new String[n];
       for(int i=0;i<n;i++)
            a[i]=sc.nextLine();
       sort(a);
       System.out.println("\n after sorting");
       for(int i=0;i<n;i++)
            System.out.println(a[i]);
   }
}