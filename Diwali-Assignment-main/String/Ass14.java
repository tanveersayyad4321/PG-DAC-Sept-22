import java.util.*;
class Ass14
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String []arr=str.split(" ");
      int n=arr.length;
      for(int i=0;i<arr.length/2;i++)
      {
          String temp=arr[i];
          arr[i]=arr[n-i-1];
          arr[n-i-1]=temp;
      }
      StringBuffer sb=new StringBuffer();
     for(int i=0;i<arr.length;i++){
           sb.append(arr[i]);
           sb.append(" ");
     }
     System.out.println(sb);
   }
}