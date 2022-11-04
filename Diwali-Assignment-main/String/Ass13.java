import java.util.*;
class Ass13
{
   static String swap(String str,int l,int r)
  {
        char c[]=str.toCharArray();
        char temp=c[l];
        c[l]=c[r];
        c[r]=temp;
        return String.valueOf(c);
  }
   static void permute(String str,int l,int r)
   {
        if(l==r){
           System.out.println(str);
           return;
        }
        else
        {
             for(int i=l;i<=r;i++)
             {
                 str=swap(str,l,i);
                 permute(str,l+1,r);
                 str=swap(str,l,i);
             }
        } 
   }
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String input=sc.nextLine();
       permute(input,0,input.length()-1);
   }
}