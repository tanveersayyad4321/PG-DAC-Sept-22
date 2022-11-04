import java.util.*;
class Ass16
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of ele in the first array");
      int n1=sc.nextInt();
      System.out.println("Enter the number of ele in the Second array");
      int n2=sc.nextInt();
      int a1[]=new int[n1];
      int a2[]=new int[n2];
      System.out.println("Enter the ele in first array");
      for(int i=0;i<n1;i++)
          a1[i]=sc.nextInt();
      System.out.println("Enter the ele in Second array");
      for(int i=0;i<n2;i++)
          a2[i]=sc.nextInt();
      for(int i=0;i<n1;i++) 
      {
          for(int j=0;j<n2;j++)
          {
              if(a2[j]==a1[i])
              {
                 System.out.println("Common element:"+a1[i]);
                 break;
              }
          }
      }

   }
}