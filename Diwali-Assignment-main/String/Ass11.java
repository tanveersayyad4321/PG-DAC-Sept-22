import java.util.*;
class Ass11
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String input=sc.nextLine();
       StringBuffer sb=new StringBuffer();
       for(int i=0;i<input.length();i++)
       {
              if(input.charAt(i)==' ')
                   sb.append("%20");
              else
                  sb.append(input.charAt(i));
        }
      System.out.println(sb.toString());
   }
}