package com.day1;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		System.out.println("Prime factor = ");
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(" "+i);
			}
		}
	}

}
