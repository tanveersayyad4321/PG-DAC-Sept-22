/* 8. Given a string and the ability to delete at most one character, return whether or not it can 
form a palindrome.
9. Note: a palindrome is a sequence of characters that reads the same forwards and 
backwards.
Ex: Given the following strings...
"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false */

import java.util.*;

class p8p9 {
    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }
    public static boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(validPalindrome(str));
	}
}