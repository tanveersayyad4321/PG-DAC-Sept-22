import java.util.*;
class Ass2
{
   public static void main(String []args)
   {
      int n1,n2;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements in first Array");
      n1=sc.nextInt();  
      System.out.println("Enter the number of elements in Second Array");
      n2=sc.nextInt();
      int a1[]=new int[n1]; 
      int a2[]=new int[n2];
      System.out.println("Enter the numbers in first array");
      for(int i=0;i<n1;i++)
      {
         a1[i]=sc.nextInt();
      }
      System.out.println("Enter the numbers in Second array");
      for(int i=0;i<n2;i++)
      {
         a2[i]=sc.nextInt();
      }
      if(n1!=n2){
         System.out.println("Not Equal");
         return;
      }
      for(int i=0,j=0;i<n1 && j<n2;i++,j++)
      {
          if(a1[i]!=a2[j])
          {
            System.out.println("Not Equal");
            return;
          }
         
      }
     System.out.println("Equal");
     return;
   }
}