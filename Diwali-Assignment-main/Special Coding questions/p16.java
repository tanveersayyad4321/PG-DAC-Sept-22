/* 16. You are given a list of words and asked to find the longest chain. Two words (or more) 
form a chain if a single letter can be added anywhere in a word, s, to form a word, t 
(where s and t are both words within the list of words you’re given). Return the length of 
the longest chain you can form.
Ex: Given the following words…
words = ["a", "ab", "abc"], return 3 ("a" can be transformed to "ab" by adding a "b" and 
"ab" can be transformed by adding a "c" giving a chain length of 3).
Ex: Given the following words…
words = ["a", "abc"], return 1 (both "a" or "abc" form their own chains of size one, they 
cannot be added together).*/

import java.util.*;
class p16 
{
    public static int longestStrChain(String[] words) 
	{
        
	    if(words == null || words.length == 0) 
		{
            return 0;
        }
	
        int res = 0;
	
        Arrays.sort(words, (a,b)-> a.length()-b.length());
	    HashMap<String, Integer> map = new HashMap(); 
	    
        for(String w : words) 
		{                            
		    map.put(w, 1);                                  
		
            for(int i=0; i<w.length(); i++) 
			{  
                
    			StringBuilder sb = new StringBuilder(w);
	    		String next = sb.deleteCharAt(i).toString();
                
		    	if(map.containsKey(next) && map.get(next)+1 > map.get(w))
			    	map.put(w, map.get(next)+1);       
        	}
		    res = Math.max(res, map.get(w));          
	    }
	    return res;
    }

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		String[] strarr=null;
		str=str.replaceAll("[^a-zA-Z\\s]","");
		strarr=str.split(" ");
		
		System.out.println(longestStrChain(strarr));
	}
}