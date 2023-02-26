package com.day1;

import java.util.Scanner;

public class SmallestNoW {
			
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to First number :");
		int num=sc.nextInt();
		System.out.println("Enter to Second number :");
		int num1=sc.nextInt();
		System.out.println("Enter to Third number :");
		int num2=sc.nextInt();
		int i=0;
		while(true)
		{
			if(i==num||i==num1||i==num2)
			{
				break;
			}
			i++;
		}
			System.out.println("Smallest nnumber is "+i);
		
			sc.close();
	}

}
