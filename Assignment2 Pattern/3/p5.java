import java.util.*;
class p5
{
		public static void main(String args[])
	{
		/*System.out.println("Enter the no. of Rows");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();*/
		int a=9;
		int count = 1;
	
		for(int i=9; i>=1; i-- ){
			for(int j=1; j<=i*2; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=9; j++)
			{
				System.out.print(j+" ");
			}
			for(int j=9-1; j>=i; j--)
			{
				System.out.print(j+" "); 
			}
			System.out.println();
			
		}
	}
}