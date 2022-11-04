import java.util.*;
class Ass1
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       HashMap<Character,Integer> map=new HashMap<>();
       for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
       for(char c:map.keySet())
       {
            if(map.get(c)>1)
                System.out.println(c);
       }
   }
}