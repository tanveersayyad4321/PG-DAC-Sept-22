import java.util.*;
class Ass23
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     ArrayList<String> list=new ArrayList<>();
     String[] res=new String[n];
     sc.nextLine();
     for(int i=0;i<n;i++)
     {
        String ele=sc.nextLine();
        list.add(ele);
     }
     for(int i=0;i<list.size();i++)
     {
         res[i]=list.get(i);
     }
     for(String k:res)
        System.out.println(k);
  }
}