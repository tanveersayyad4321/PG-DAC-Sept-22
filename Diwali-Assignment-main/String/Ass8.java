import java.util.*;
class Ass8
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String input=sc.nextLine();
       HashMap<Character,Integer> map=new HashMap<>();
       for(char c:input.toCharArray())
           map.put(c,map.getOrDefault(c,0)+1);
       for(char c:map.keySet())
       {
             System.out.println(c+": "+map.get(c));
       }
   }
}