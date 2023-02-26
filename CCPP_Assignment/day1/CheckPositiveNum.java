package com.day1;

import java.util.Scanner;

public class CheckPositiveNum {
			
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to check weather is positive or negative number :");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num+" is a Positive number");
			
		}
		else if(num<0) 
		{
			System.out.println(num+" is a Negative number");

		}else
		{
			System.out.println(num+" is a neutral number");
		}

	}

}
