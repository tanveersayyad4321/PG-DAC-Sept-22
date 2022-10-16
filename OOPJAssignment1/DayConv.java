import java.util.*;
class DayConv
{
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Days : ");
		int days=sc.nextInt();
		int remDays=0;
		
		int year=days/365;
		int month=(int)((days%365)/(30.41));
		days=days%365;
		remDays=days%30;
		
		
		
		System.out.println("Years : "+year);
		System.out.println("Months : "+month);
		System.out.println("Days : "+remDays);
		
	}
}	