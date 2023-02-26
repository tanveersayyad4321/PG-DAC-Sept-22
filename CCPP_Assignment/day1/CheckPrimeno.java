package com.day1;

import java.util.Scanner;

public class CheckPrimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		
			int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Number is prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
			
		}
	}


