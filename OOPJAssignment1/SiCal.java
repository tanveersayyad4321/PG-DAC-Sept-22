import java.util.*;
class SiCal
{
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount : ");
		double pAmount=sc.nextDouble();
		System.out.println("Enter Rate Of Interest : ");
		double interest=sc.nextDouble();
		System.out.println("Enter Time : ");
		double time=sc.nextDouble();
		
		double si=(pAmount*interest*time)/100;
		System.out.println("Simple Interest : "+si);
		
		
	}
}	