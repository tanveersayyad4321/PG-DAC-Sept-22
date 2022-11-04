import java.util.*;
class Ass20
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the String");
      String s=sc.nextLine();   
      System.out.println("Enter the char");
      char c=sc.next().charAt(0);
      StringBuffer sb=new StringBuffer();
      for(int i=0;i<s.length();i++)
      {
           if(s.charAt(i)!=c)
               sb.append(s.charAt(i));
      }
      System.out.println(sb);
   }
}