/*1. Note: a palindrome is a sequence of characters that reads the same forwards and 
backwards.
Ex: Given the following strings...
"A man, a plan, a canal: Panama.", return true*/

import java.util.Scanner;
class p1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		str = str.replaceAll("\\s", "");
		str=str.toLowerCase(); 
		StringBuilder strb = new StringBuilder();
		StringBuilder strb1 = new StringBuilder();
		strb1.append(str);
		strb.append(str);
		
		strb.reverse();
		
		int result=strb1.compareTo(strb);
		
		System.out.println("A String is palindrome : "+((result==0)?true:false));
	}
}