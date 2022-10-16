import java.util.*;
class TempConv
{
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temptaure Fahrenheit : ");
		double f=sc.nextDouble();
		
		double celsius=5*(f-32)/9;
		
		
		System.out.println("Temptaure In Celsius : "+celsius);
		
		
	}
}	