import java.util.*;
class p18
{
	public static void main(String args[])
	{
		System.out.println("Enter the no. of Rows");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		
		for(int i=a;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64)+" ");
							
			}
			System.out.println();
		}
	}
}