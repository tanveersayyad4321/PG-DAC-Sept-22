import java.util.*;
class Ass2
{
   public static void main(String []args)
   {
       int count[]=new int[26];
       Arrays.fill(count,0);
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String lowcase=str.toLowerCase();
       for(int i=0;i<lowcase.length();i++)
            count[lowcase.charAt(i)-'a']++;
       for(int i=0;i<26;i++)
       {
             if(count[i]>1)
                 System.out.println((char)(i+'a')+" ");
       }
   }
}