class Room
{
	double height,width,breadth;
	
	
	Room(){}
	
	Room(double height,double width,double breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	double getVolume()
	{
		return height*width*breadth;
	}
	
}
class RoomDemo
{
	public static void main(String [] args)
	{
		Room r[]=new Room[2];
		
		r[0]=new Room(12,25,30);
		r[1]=new Room(25,30,45);
		
		for(int i=0;i<r.length;i++)
		{
			System.out.println("Volume Of Room : "+r[i].getVolume());
		}
	}
	
}