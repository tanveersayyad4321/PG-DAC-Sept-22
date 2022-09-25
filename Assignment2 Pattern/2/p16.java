import java.util.*;
class p16
{
	public static void main(String args[])
	{
		/*System.out.println("Enter the no. of Rows");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();*/
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==5||j==1||i==j)
				System.out.print("*");
			    else
					System.out.print(" ");
			}
			System.out.println();
		}
		
			
	}
}