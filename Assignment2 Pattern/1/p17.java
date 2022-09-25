import java.util.*;
class p17
{
	public static void main(String args[])
	{
		System.out.println("Enter the no. of Rows");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int num=1;
		for(int i=1;i<=a;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(num+" ");
				num++;				
			}
			System.out.println();
		}
	}
}