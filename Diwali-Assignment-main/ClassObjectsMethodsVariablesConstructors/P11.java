//  Java Program to Illustrate Use of Methods in a Class

class Addition{
	
	int sum;
	static int count;
	
	Addition(){
		this.sum = 0;
		count++;
	}
	
	int addToIntegers(int x, int y){
		sum = x + y;
		return sum;
	}
	
	static void printCountOfObject(){
		// return sum; // error: because static methods can only access Static members
		System.out.println("Number of objects calculated on: " + count);
	}
}
class P11{

	public static void main(String[] args){
		
		Addition add = new Addition();
		int res = add.addToIntegers(5,10);
	
		System.out.println("Sum is: " + res);
		
		Addition.printCountOfObject();
	}
}

