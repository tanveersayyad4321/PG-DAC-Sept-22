package com.day2;

import java.util.*;

public class SecondMinimumNumberInArray {

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
	      Arrays.sort(arr);
	      
	      System.out.println("Second largest number "+arr[length-2]);

	}

}
