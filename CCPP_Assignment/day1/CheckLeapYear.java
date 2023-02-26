package com.day1;

import java.util.Scanner;

public class CheckLeapYear {
			
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to check weather a year is leap year or not :");
		int num=sc.nextInt();
		if(num%4==0&&num%100!=0||num%400==0)
		{
			System.out.println(num+" is a Leap year");
			
		}
		else
		{
			System.out.println(num+" is not a Leap year");
		}
			sc.close();
	}

}
