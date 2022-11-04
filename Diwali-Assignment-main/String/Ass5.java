import java.util.*;
class Ass5
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       for(int i=0;i<s.length();i++)
       {
             if(!Character.isDigit(s.charAt(i)))
             {
                  System.out.println("not only contains digits");  
                  return;
             }
       }
      System.out.println("only contains digits"); 
   }
}