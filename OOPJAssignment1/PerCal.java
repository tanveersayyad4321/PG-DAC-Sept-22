import java.util.*;
class PerCal
{
	public static void main(String []args)
	{
		double arr[]=new double[5];
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks : ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextDouble();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		double per=sum/5;
		System.out.println("Percentage Marks = "+per+"%");
	}
}	