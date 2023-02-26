package com.day1;

import java.util.Scanner;

public class factCalUsingR {
	
	static double factCal(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num*factCal(num-1);
		}
	}

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number :");
			int num=sc.nextInt();
			
			System.out.println("Factorial of "+num+" = "+factCal(num));
		}


	}


