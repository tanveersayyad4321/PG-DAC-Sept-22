package com.day1;

import java.util.Scanner;

public class GcdOfNumber {
			
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number :");
		int num=sc.nextInt();
		System.out.println("Enter second number :");
		int num1=sc.nextInt();
		int gcd=1;
		for(int i=1;i<=num&&i<=num1;i++)
		{
			if(num%i==0 && num1%i==0)
			{
				gcd=i;
			}
		}
		
			System.out.println("GCD is "+gcd);
		
			sc.close();
	}

}
