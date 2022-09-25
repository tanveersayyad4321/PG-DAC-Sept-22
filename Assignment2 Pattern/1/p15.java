import java.util.*;
class p15
{
	public static void main(String args[])
	{
		System.out.println("Enter the no. of Rows");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--)
			{
				System.out.print(j+" ");
								
			}
			System.out.println();
		}
	}
}