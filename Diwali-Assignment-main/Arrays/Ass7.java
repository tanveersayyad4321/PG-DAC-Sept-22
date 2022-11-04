import java.util.*;
class Ass7
{
  public static void main(String []args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the first Array");
      int n1=sc.nextInt();
      System.out.println("Enter the size of the Second Array");
      int n2=sc.nextInt();
      int a1[]=new int[n1];
      int a2[]=new int[n2];
      System.out.println("Enter the elements in the first Array");
      for(int i=0;i<n1;i++)
      {
         a1[i]=sc.nextInt();
      }
      System.out.println("Enter the elements in the Second Array");
      for(int i=0;i<n2;i++)
      {
         a2[i]=sc.nextInt();
      }
      int a3[]=new int[n1+n2];
      int k=0;
      int i=0,j=0;
      for(;i<n1 && j<n2;i++,j++)
      {
          a3[k++]=a1[i];
          a3[k++]=a2[j];  
      }     
      if(i<n1)
      {
          for(;i<n1;i++)
          {
              a3[k++]=a1[i];
          }
      }
      if(j<n2)
      {
          for(;j<n2;j++)
          {
              a3[k++]=a2[j];
          }
      }
      for(i=0;i<n1+n2;i++)
          System.out.print(a3[i]+" ");
  }
}