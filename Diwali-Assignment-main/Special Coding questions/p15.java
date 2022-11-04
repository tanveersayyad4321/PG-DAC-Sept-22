/* Q 15. Given a string, s, return the length of the longest substring that contains every vowel 
occurring an even number of times.
Note: You may assume s only contains lowercase alphabetical characters and the vowels 
you must account for are a, e, i, o, and u.
Ex: Given the following string s…
s = "aeiouaeioua", return 10 (the last 'a' cannot count).
Ex: Given the following string s…
s = "bbb", return 3 (all vowels occur an even number of times, i.e. zero times each). */

import java.util.*;
class p15 
{
 
     public static int findTheLongestSubstring(String s) 
	 {
        int res = 0 , mask = 0, n = s.length();
        HashMap<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1);
        for (int i = 0; i < n; ++i) 
		{
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{ 
                int c=s.charAt(i);
                mask=mask ^ c;
                seen.putIfAbsent(mask, i);
            }            
            res = Math.max(res, i - seen.get(mask));
        }
        return res;
    }

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		System.out.println(findTheLongestSubstring(str));
	}
}