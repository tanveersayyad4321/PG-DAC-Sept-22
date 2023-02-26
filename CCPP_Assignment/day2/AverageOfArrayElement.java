package com.day2;
import java.util.*;
public class AverageOfArrayElement {

	public static void main(String[] args) {
		  System.out.println("Enter number of elements ");
	      Scanner sc =new Scanner(System.in);
	      int n=sc.nextInt();
	      int []arr=new int[n];
	      System.out.println("Enter array elements ");
	      for(int i=0;i<arr.length;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	      int sum=0;
	      for(int i=0;i<arr.length;i++) {
	    	  sum=sum+arr[i];
	      }
	      
	      double avg=sum/arr.length;
	      
	      System.out.println("Average of array is "+avg);
	      
	}

}
