//  Java Program to Illustrate Use of Constructor

final class Demo{
	
	final int x;
	
	Demo() { 
		this.x = 5;
	}	
	
	Demo(int x){
		this.x = x;
	}
}

class P17{

	public static void main(String[] args){
		
		final int x = 6;
		x = 7; // not allowed
	
	}
}

