import java.util.*;
class MathOperation
{
	static double diff;
	
	
	static double add(double num1,double num2)
	{
		return num1+num2;
	}
	static double subtract(double num1,double num2)
	{
		if(num1>num2)
		{
			diff = num1-num2;
		}
		else
		{
			diff = num2-num1;
		}
		return diff;
	}
	static double multiply(double num1,double num2)
	{
		return num1*num2;
	}
	static double power(double num1,double num2)
	{
		return Math.pow(num1,num2);
	}
	
}
class MathOperationDemo
{
	public static void main(String [] args)
	{
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Numbers For Math Operations \nFirst Numbers : ");
		num1=sc.nextInt();
		System.out.print("Second Numbers : ");
		num2=sc.nextInt();
		System.out.println("========================================================");
		
		System.out.println("Addition of Numbers : "+MathOperation.add(num1,num2));
		System.out.println("Subtraction Of Two Number : "+MathOperation.subtract(num1,num2));
		System.out.println("Multiplication Of Two Number : "+MathOperation.multiply(num1,num2));
		System.out.println("Power Of "+num1+" To "+num2+" : "+MathOperation.power(num1,num2));
		System.out.println("========================================================");
	}
	
}