import java.util.*;
class Ass4
{
   public static void main(String []args)
   {
       int count[]=new int[26];
       Arrays.fill(count,0);
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       s=s.toLowerCase();
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++)
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       for(int i=0;i<s.length();i++)
       {
          if(map.get(s.charAt(i))==1)
          {
               System.out.println(s.charAt(i));
          }
       }
   }
}