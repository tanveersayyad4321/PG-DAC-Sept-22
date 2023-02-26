package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberInArray {
	public static void main(String[] args) {
		  System.out.println("Enter number of elements ");
	      Scanner sc =new Scanner(System.in);
	      int n=sc.nextInt();
	      int []arr=new int[n];
	      System.out.println("Enter array elements ");
	      for(int i=0;i<arr.length;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	      int length=arr.length;
	      
	      int b=n+1;
	      int totalsum=(b*(b+1))/2;
	      int sum=0;
	      for(int i=0;i<arr.length;i++)
	      {
	    	  sum+=arr[i];
	      }
	      int missnum=totalsum-sum;
	      
	      System.out.println("Missed num "+missnum);
	      
	}
}
