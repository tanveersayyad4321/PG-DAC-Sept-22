package com.day1;

import java.util.Scanner;

public class PrintPerfectNo {
	static boolean isPerfect(int num)
	{
		if(num==1)
		return false;
		
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
			return true;
		
		return false;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		
		for(int i=1;i<num;i++)
		{
			if(isPerfect(i))
			{
				System.out.println(" "+i);
			}
			
		}	
		}
	}


