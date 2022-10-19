import java.util.*;
class DateDemo                                                                                                
{
	int day,month,year,daypre;
	
	
	DateDemo(){}
	
	DateDemo(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	int getPreDay()
	{
		if(day==1)
		{
			daypre=31-day;			//Consider 30 day Month  
		}
		else
		{
			daypre=day-1;
		}
		return daypre;
		
	}
	int getNextDay()
	{
		return day+1;
	}
	int getDay()
	{
		return day;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		DateDemo d[]=new DateDemo[4];
		
		d[0]=new DateDemo(01,01,1970);
		
		System.out.print("Enter Day : ");
		int a=sc.nextInt();
		d[1]=new DateDemo(a,01,1970);
		System.out.print("Enter Day : ");
		int a1=sc.nextInt();
		System.out.print("Enter Month : ");
		int b1=sc.nextInt();
		d[2]=new DateDemo(a1,b1,1970);
		System.out.print("Enter Day : ");
		int a2=sc.nextInt();
		System.out.print("Enter Month : ");
		int b2=sc.nextInt();
		System.out.print("Enter Year : ");
		int c2=sc.nextInt();
		d[3]=new DateDemo(a2,b2,c2);
		
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println("-----------------------------------");
			System.out.println("Precious Day : "+d[i].getPreDay());
			System.out.println("Today Day : "+d[i].getDay());
			System.out.println("Next Day : "+d[i].getNextDay());
			
			System.out.println("-----------------------------------");
		}
	}
	
}