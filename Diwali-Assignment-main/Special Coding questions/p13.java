/* 13. Given an encoded string, s, return its decoded representation. The string s will be 
encoded as follows N[letters], meaning that the letters should be repeated N times in the 
decoded representation.
Note: You may assume s always encoded correctly (i.e. correct formatting of brackets, 
only positive values outside the brackets, and always lowercase alphabetical characters 
inside the brackets).
Ex: Given the following string s…
s = "3[a]2[b]1[c]", return "aaabbc" ("a" is repeated 3 times, "b" is repeated 2 times, and 
"c" is repeated 1 time). */

import java.util.*;
class p13 {
    
    int i = 0;

    public String decodeString(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (Character.isLetter(c)) {
                sb.append(c);
            } else if (Character.isDigit(c)) {
                count = count * 10 + Character.getNumericValue(c);
            } else if (c == ']') {
                break;
            } else if (c == '[') {
                // sub problem
                String repeat = decodeString(s);
                while (count > 0) {
                    sb.append(repeat);
                    count--;
                }
            }
        }
        return sb.toString();
    }

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		p13 d=new p13();
		System.out.println(d.decodeString(str));
	}
}