import java.util.*;
class CircleCal
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius Of Cicle : ");
		double radius=sc.nextDouble();
		
		double areaCircle=3.14*radius*radius;
		double circumCircle=2*3.14*radius;
		
		System.out.println("Area Of The Circle : "+areaCircle);
		System.out.println("Circumference Of The Circle : "+circumCircle);
	}
}