import java.util.*;
class Ass6
{
  public static void main(String []args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n<3)
        System.out.println("please enter value greater than 3");
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
         a[i]=sc.nextInt();
      }
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      int i;
      for(i=0;i<3;i++)
      {
         pq.add(a[i]);
      }
      for(;i<n;i++)
      {
         if(pq.peek()<a[i])
         {
            pq.add(a[i]);
            pq.poll();
         }
      }
    System.out.println("The Third Largest ele is "+pq.peek());
  }
}