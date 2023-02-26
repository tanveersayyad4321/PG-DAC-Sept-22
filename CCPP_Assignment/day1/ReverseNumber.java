package com.day1;

import java.util.Scanner;

public class ReverseNumber {
			
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to check digit of number :");
		int num=sc.nextInt();
		
		int rem=0;
	
		while(num!=0)
		{
			rem=rem*10+num%10;
			num=num/10;
			
		}
			System.out.println("Reverse Number "+rem);
		
			sc.close();
	}

}
