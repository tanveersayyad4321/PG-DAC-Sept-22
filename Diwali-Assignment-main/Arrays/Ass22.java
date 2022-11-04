import java.util.*;
class Ass22
{
  public static void main(String []args) throws Exception
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     Integer a[]=new Integer[n];
     for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
     List<Integer> list=Arrays.asList(a);
     TreeSet<Integer> set=new TreeSet<>(list);
     System.out.println(set);
  }
}