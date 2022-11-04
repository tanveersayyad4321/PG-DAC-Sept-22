import java.util.*;
class Ass3
{
   public static void main(String []args)
   {
       int count[]=new int[26];
       Arrays.fill(count,0);
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the First String");
       String str1=sc.nextLine();
       System.out.println("enter the Second String");
       String str2=sc.nextLine(); 
       StringBuffer sb1=new StringBuffer();
       StringBuffer sb2=new StringBuffer();
       System.out.println("case will not be checked");
       String lowcase=str1.toLowerCase();
       for(int i=0;i<lowcase.length();i++)
            count[lowcase.charAt(i)-'a']++;
       for(int i=0;i<26;i++)
       {
             sb1.append(count[i]);
             sb1.append('#');
       }
       Arrays.fill(count,0);
       lowcase=str2.toLowerCase();
       for(int i=0;i<lowcase.length();i++)
            count[lowcase.charAt(i)-'a']++;
       for(int i=0;i<26;i++)
       {
             sb2.append(count[i]);
             sb2.append('#');
       }
       //System.out.println(sb1+"      "+sb2);
       if((sb1.toString()).equals(sb2.toString()))
            System.out.println("Anagram");
       else
            System.out.println("not Anagram");
   }
}