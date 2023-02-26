package com.day1;

import java.util.Scanner;

public class DigitOfNumber {
			
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to check digit of number :");
		int num=sc.nextInt();
		int num1=num;
		int rem=0;
		int sum=0;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			sum+=rem;
		}
			System.out.println("Sum of Digit is "+sum);
		
			sc.close();
	}

}
