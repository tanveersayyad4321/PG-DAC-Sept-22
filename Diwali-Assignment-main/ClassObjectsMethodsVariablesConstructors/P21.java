// Java Program to Create an Object for Class and Assign Value in the Object using Constructor

class First {
	int b;
	int c;

	// parameterized constructor of class First
	First(int b, int c)
	{
		this.b = b;
		this.c = c;
		System.out.println("First class constructor");
		System.out.println("multiplication of two number " + b + " and " + c + " is " + b * c);
	}
}
class Second extends First {
	int a;

	// parameterized constructor of class Second
	Second(int b, int c, int a)
	{
		
		// calls constructor of First
		super(b, c);
		System.out.println("Second class constructor");
		System.out.println("Second class data member a: " + a);
	}
}


class P21{
	
	public static void main(String args[]){
	
		Second obj = new Second(3, 4, 5);

	}
}
