import java.util.*;
class GrossSalary
{
	public static void main(String []args)
	{
		double gsalary=0;
		double hra=0;
		double da=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary : ");
		double bsalary=sc.nextDouble();
		
		if(bsalary>=10000)
		{
			hra=2000;
			da=(bsalary/100)*98;
			gsalary=bsalary+da+hra;
			System.out.println("Gross Salary : "+gsalary);
		}
		else
		{
			hra=bsalary/10;
			da=(bsalary/100)*90;
			gsalary=bsalary+da+hra;
			System.out.println("Gross Salary : "+gsalary);
		}
		
		
		
	}
}	