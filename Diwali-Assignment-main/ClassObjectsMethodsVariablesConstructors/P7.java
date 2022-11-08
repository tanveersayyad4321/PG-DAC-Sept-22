//   Java Program to Implement Shape Interface using Circle and Rectangle Class

interface Shape{
	void calArea();
	void printArea();
}

class Rectangle implements Shape{
	
	private double length;
	private double breadth;
	private double area;
	
	Rectangle(){
		length = 5;
		breadth = 15;
		area = length * breadth;
	}
	
	Rectangle(double length, double breadth){
		this();
		this.length = length;
		this.breadth = breadth;
	}
	
	void setLength(double length){
		this.length = length;
	}
	
	double getLength(){
		return length;
	}
	
	void setBreadth(double length){
		this.breadth = breadth;
	}
	
	double getBreadth(){
		return breadth;
	}

	public void calArea(){
		area = length * breadth;
	}
	
	public void printArea(){
		System.out.println("Area of Rectangle: " + area);
	}
}

class Circle implements Shape{
	
	private final double PI;
	private double radius;
	private double area;
	
	Circle(){
		radius = 1.0;
		PI = Math.PI;
		area = 1.0;
	}
	
	Circle(double radius){
		this();
		this.radius = radius;
	}
	
	void setRadius(double radius){
		this.radius = radius;
	}
	
	double getRadius(){
		return radius;
	}
	
	public void calArea(){
		area = PI * radius * radius;
	}
	
	public void printArea(){
		System.out.println("Area of Circle: " + area);
	}
}

class P7{
	public static void main(String[] args){
		Rectangle rect = new Rectangle(15,10);
		System.out.println("Length: " + rect.getLength());
		System.out.println("Breadth: " + rect.getBreadth());
		rect.calArea();
		rect.printArea();
		
		System.out.println();
		
		Circle cir = new Circle(15.2);
		System.out.println("Radius: " + cir.getRadius());
		cir.calArea();
		cir.printArea();
	}
}