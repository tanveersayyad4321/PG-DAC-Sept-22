class Box
{
	double height,width,breadth;
	
	
	Box(){}
	
	Box(double height,double width,double breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	double getVolume()
	{
		return height*width*breadth;
	}
	double getArea()
	{
		return 2*height*width+2*breadth*height+2*breadth*width;
	}
}
class BoxVolArea
{
	public static void main(String [] args)
	{
		Box b[]=new Box[2];
		
		b[0]=new Box(10,20,30);
		b[1]=new Box(20,30,40);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Volume Of Box : "+b[i].getVolume());
			System.out.println("Area Of Box : "+b[i].getArea());
		}
	}
	
}