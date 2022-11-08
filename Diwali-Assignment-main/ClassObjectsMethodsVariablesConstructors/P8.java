//  Java Program to Count Number of Objects Created for Class

class Demo{
	
	static int count; 
	
	Demo(){
		count++;
	}
	
}
class P8{

	public static void main(String[] args){
		
		new Demo();
		new Demo();
		new Demo();	
		
		System.out.println("Number of Demo Objects created is: " + Demo.count);
	}
}

// stati variables can be used to keep track of no of objects created
// static variables are shared by all objects 
// it is created once per class
