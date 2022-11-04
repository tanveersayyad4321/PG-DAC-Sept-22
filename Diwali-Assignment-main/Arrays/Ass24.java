import java.util.*;
class Ass24
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if(n<=1)
           return;
       int a[]=new int[n];
       for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       for(int i=0;i<2;i++)
           pq.add(a[i]);
       for(int i=2;i<n;i++)
       {
            if(a[i]>pq.peek())
           {
              pq.add(a[i]);
              pq.poll();
           }
       }
       System.out.println("Second Largest:"+pq.peek());
   }
}