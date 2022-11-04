/* 11. Given two strings, s and t, merge the two strings together alternating characters starting 
with s.
Note: If one string is longer than the other, append the remaining characters of the longer 
string at the end of the merged string.
s = "abc", t = "def", return "adbecf". */

import java.util.*;
class p11 {
    public static String mergeAlternately(String str1, String str2) {
    String  ans ="";
        int ab =0;
        int ac =0;
        
        for(int i=0;i<str1.length()+str2.length();i++){       
            if(i<str1.length()){
                ans+=str1.charAt(ab);
                ab++;
            }
            if(i<str2.length()){
                ans +=str2.charAt(ac);
                ac++;
            }
        }   
    return ans;
    }
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(mergeAlternately(str1,str2));
	}
}