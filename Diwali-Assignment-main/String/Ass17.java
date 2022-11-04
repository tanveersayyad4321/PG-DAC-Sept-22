import java.util.*;
class Ass17
{
   public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the 3 String Inputs");
     String s1=sc.nextLine();   
     String s2=sc.nextLine();
     String s3=sc.nextLine();
     int i=0,j=0,k=0; 
     int f=0;
     if(s1.length()+s2.length()!=s3.length())
     {
         System.out.println("Invalid Shuffle");
         return;
     }
     while(i<s1.length() && j<s2.length())
     {
         if(s3.charAt(k)==s1.charAt(i))
         {
             i++;
             k++;
         }
         else if(s3.charAt(k)==s2.charAt(j))
         {
            k++;
            j++;  
         }
         else{
            f=1; 
            break;
         }
     }    
     if(f!=1 && i<s1.length())
     {
         while(i<s1.length())
         {
             if(s3.charAt(k)==s1.charAt(i)){
                k++;
                i++; 
             }
             else
             {
                   f=1;
                   break;
             }
         }
     }
     if(f!=1 && j<s2.length())
     {
         while(j<s2.length())
         {
             if(s3.charAt(k)==s2.charAt(j)){
                k++;
                j++; 
             }
             else
             {
                   f=1;
                   break;
             }
         }
     }
     if(f==0)
         System.out.println("Valid Shuffle");
     else
         System.out.println("InValid Shuffle");
     
  }
}