// Java Program to Demonstrate Usage of a Static Variable in the Test Class

class P24{
	
	static int count; 
	
	P24(){
		count++;
	}
	
	public static void main(String[] args){
		
		new P24();
		new P24();
		new P24();	
		
		System.out.println("Number of objects created is: " + count);
	}
	
}

// can be used to keep track of no of objects created
// static variables are shared by all objects 
// it is created once per class
// common shared data between objects is kept static