import java.util.*;
class Ass25
{
   static boolean check(String s)
   {
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++)
      {
         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);   
      }
      int odd=0;
      for(char c:map.keySet())
      {
         if(map.get(c)%2==1)
             odd++;       
      }
      if(odd>1)
           return false;
      else
           return true;
   }
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      if(check(s))
         System.out.println("Palindrome Possible");
      else
          System.out.println("Palindrome not Possible");
   }
}
