import java.util.*;
class p17
{
   static int check(String s,char c)
   {
       int sum=0;
       for(int i=0;i<s.length();i++)
       {
          if(s.charAt(i)==c)
                sum++;
       }
       return sum;
   }
   static HashMap<String,Integer> fun(String []a)
   {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:a)
        {
            char []ch=s.toCharArray();
            Arrays.sort(ch);
            int val=check(s,ch[0]);
            map.put(s,val);
        }
      return map;
   }
   public static void main(String []args)
   {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of words");
      n=sc.nextInt();
      System.out.println("Enter the words");
      sc.nextLine();
      String []words=new String[n];
      for(int i=0;i<n;i++)
            words[i]=sc.nextLine();
      System.out.println("Enter the number of Queries");
      int p=sc.nextInt();
      String []queries=new String[p];
      System.out.println("Enter the Queries");
      sc.nextLine();
      for(int i=0;i<p;i++)
            queries[i]=sc.nextLine();
      HashMap<String,Integer> wordlist=fun(words); 
      HashMap<String,Integer> querylist=fun(queries);
      int res[]=new int[p];
      int j=0;
      for(String s:queries)
      {    
           int sum=0;
           for(String w:words)
           {
                  if(querylist.get(s)<wordlist.get(w))
                          sum++;
           }
        res[j++]=sum;
      }
      for(int i=0;i<p;i++)
         System.out.print(res[i]+" ");
      
   }
}