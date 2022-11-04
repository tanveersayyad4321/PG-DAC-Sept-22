import java.util.*;
class Ass21
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
     List<Integer> list=new ArrayList<>();
     for(int i=0;i<n;i++)
          list.add(a[i]);
     for(int i:list)
         System.out.println(i+" ");
  }
}