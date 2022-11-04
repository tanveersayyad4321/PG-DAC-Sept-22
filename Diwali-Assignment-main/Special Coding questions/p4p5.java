/*4. Given two binary strings (strings containing only 1s and 0s) return their sum (also as a 
binary string).
5. Note: neither binary string will contain leading 0s unless the string itself is 0
Ex: Given the following binary strings...
"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return "1"*/

import java.util.*;
class p4p5
{
	public static String sumBinary(String f,String s)
	{
        StringBuilder sb = new StringBuilder();
        int i = f.length() - 1, j = s.length() -1, carry = 0;
        while (i >= 0 || j >= 0)
		{
            int sum = carry;
            if (j >= 0) sum += s.charAt(j--) - '0';
            if (i >= 0) sum += f.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }


public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String f=sc.nextLine();
	String s=sc.nextLine();
	
	System.out.println(sumBinary(f,s));
	
}	
}