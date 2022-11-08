//   Java Program to Illustrate Use of Abstract Class and Method

abstract class Shape{
	private double area;
	
	Shape(){ // abstract classes can have constructors
		area = 12.0;
	}
	
	abstract void calArea();
	
	void setArea(double area){
		this.area = area; 
	}
	
	double getArea(){
		return area;
	}
	
	void printArea(){
		System.out.println("Area: " + area);
	}
}

class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	Rectangle(){
		length = 5;
		breadth = 15;
	}
	
	Rectangle(double length, double breadth){
		this();
		this.length = length;
		this.breadth = breadth;
	}
	
	void calArea(){
		double area = length * breadth;
		setArea(area);
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

}

class P2{
	public static void main(String[] args){
		// Shape shp = new Rectangle(12,15); // allowed to have abstract class reference but it has limitation
											// to access the methods and members of the child class 
		
		Rectangle shp = new Rectangle(12,15);
		System.out.println("Length: " + shp.getLength());
		System.out.println("Breadth: " + shp.getBreadth());
		shp.calArea();
		double area = shp.getArea();
	
		System.out.println("Area is: " + area);
	}
}