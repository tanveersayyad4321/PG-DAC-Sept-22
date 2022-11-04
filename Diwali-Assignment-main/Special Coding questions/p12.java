/* 12. Given a string, s, return the total number of substring within s that contain the same 
character.
Note: You may assume that s only contains lowercase alphabetical characters.
Ex: Given the following string s…
s = "aabca", return 6 ("a" appears 3 times, "aa" appears 1 time, "b" appears 1 time, and "c" 
appears 1 time). */

import java.util.*;
class p12 {
    public static int countHomogenous(String s) {
        int c=1;
        int res=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
              
                c++;
                
            }
            else{
                c=1;
                
                
              
            }
           res=(res+c)%10;
        }
        return res+1;
    }
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(countHomogenous(str));
	}
}