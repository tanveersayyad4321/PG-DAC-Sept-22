package com.day1;

import java.util.Scanner;

public class SumWithoutPlus {
			
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to First number :");
		int num=sc.nextInt();
		System.out.println("Enter to Second number :");
		int num1=sc.nextInt();

		for(int i=0;i<num1;i++)
		{
			num++;
		}
			System.out.println("Sum of two number is "+num);
		
			sc.close();
	}

}
