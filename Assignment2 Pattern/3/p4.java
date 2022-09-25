import java.util.*;
class p4{
		public static void main(String args[])
	{
		/*System.out.println("Enter the no. of Rows");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();*/
		int a=9;
		int count = 1;
	
		for (int i=a; i>0; i--){
			
			for (int j = 1; j <= i * 2; j++)
            {
                System.out.print(" ");
            }
			for (int j = 1; j <= count; j++)
            {
                System.out.print(j+" ");
            }
			
			for (int j = count-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
			System.out.println();
			count++;
		}
	}
}