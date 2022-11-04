import java.util.*;
class Ass15
{
  public static void main(String []args)
  { 
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
        for(int i=0;i<n;i++)
             a[i]=sc.nextInt();
        Arrays.sort(a); 
        System.out.println("Here are the missing numbers");
        for(int i=1;i<=100;i++)
        {
              int left=0,right=n-1;
              int f=0;
              inner:while(left<=right)
              {
                    int mid=left+(right-left)/2;
                    if(a[mid]==i)
                    {
                        f=1;
                        break;
                    }
                    else if(a[mid]<i)
                        left=mid+1;
                    else
                        right=mid-1;
              }
              if(f!=1)
                  System.out.println(i);
        }
   }
}