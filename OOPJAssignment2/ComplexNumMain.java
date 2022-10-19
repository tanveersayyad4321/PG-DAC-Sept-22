class ComplexNumCal
{
	int realPart1=0;
	int imagPart1=0;
	int realPart2=0;
	int imagPart2=0;
	int addReal=0;
	int addImag=0;
	int multi=0;
	int mulReal=0;
	int mulImag=0;
	ComplexNumCal()
	{
	
	}
	ComplexNumCal(int realPart1)
	{
		this.realPart1=realPart1;
		
	}
	ComplexNumCal(int realPart1,int imagPart1)
	{
		this.realPart1=realPart1;
		this.imagPart1=imagPart1;
	}
	
	void add(int realPart2,int imagPart2)
	{
		addReal=realPart1+realPart2;
		addImag=imagPart1+imagPart2;
		System.out.println("Addition Of Two Complex Number : "+addReal+"+("+addImag+")i");
	}
	void multiply(int realPart2,int imagPart2)
	{
		mulReal=(realPart1*realPart2)-(imagPart1*imagPart2);
		mulImag=(realPart1*imagPart2)+(imagPart1*realPart2);
		System.out.println("Product Of Two Complex Number : "+mulReal+"+("+mulImag+")i");
	}
	
}
class ComplexNumMain
{
	public static void main(String [] args)
	{
		ComplexNumCal c1=new ComplexNumCal();
		
		ComplexNumCal c2=new ComplexNumCal(3);
		
		ComplexNumCal c3=new ComplexNumCal(3,2);
		
		c3.add(4,-2);
		c3.multiply(4,-2);
	}
	
}