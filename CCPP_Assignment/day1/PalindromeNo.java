package com.day1;

import java.util.Scanner;

public class PalindromeNo {
			
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number :");
		int num=sc.nextInt();
		int org=num;
		int res=0;
		
		while(num>0)
		{
			res=res*10+num%10;
			num=num/10;
		}
		if(res==org)
		{
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
			
		}

			sc.close();
	}

}
