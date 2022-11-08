//   Java Program to Create a Method without Parameters and with Return Type

class Addition{
	
	int x;
	int y;
	
	Addition(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	int addToIntegers(){
		return x + y;
	}

}
class P12{

	public static void main(String[] args){
		
		Addition add = new Addition(5,10);
		int sum = add.addToIntegers();
	
		System.out.println("Sum is: " + sum);

	}
}

