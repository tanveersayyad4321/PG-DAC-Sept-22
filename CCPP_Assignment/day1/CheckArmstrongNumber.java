package com.day1;

import java.util.Scanner;

public class CheckArmstrongNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int org=num;
		int count=0;
		int sum=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		num=org;
		while(org!=0)
		{
			int rem=org%10;
			sum=(sum+(int)Math.pow(rem, count));
			org=org/10;
		}
		if(num==sum) {
			System.out.println(num+" is Armstrong number");
		}
		else
			System.out.println(num+" is not Armstrong number");
		}
	}


