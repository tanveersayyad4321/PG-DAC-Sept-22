import java.util.*;
class Ass19
{
   public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     HashMap<Character,Integer> map=new HashMap<>();
     String s=sc.nextLine();
     for(int i=0;i<s.length();i++)
     {
        char c=s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
     } 
     int max=Integer.MIN_VALUE;
     int f=0;
     char maxchar='a';
     for(char c:map.keySet())
     {
         if(max<map.get(c))
         {
            max=map.get(c); 
            maxchar=c;
            f=1;
         }   
     }
     if(f==0)
        System.out.println("No Max Char");
     else
        System.out.println(" Max Occurance of Char is  "+maxchar+": "+max);
  }
}