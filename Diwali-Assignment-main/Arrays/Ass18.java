import java.util.*;
class Ass18
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<n;i++)
     {
        map.put(a[i],map.getOrDefault(a[i],0)+1);
     }
  for(int i:map.keySet())
  {
      if(map.get(i)>1)
          System.out.println("Duplicate present:"+i);
  }
}
}