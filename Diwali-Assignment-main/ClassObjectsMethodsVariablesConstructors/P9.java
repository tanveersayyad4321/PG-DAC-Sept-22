//  Java Program to Implement the Passing and Returning Objects

class Demo{
	
	int x;
	
	Demo(){
		this.x = 5;
	}
	
	Demo(int val){
		this.x = val;
	}
	
	void changeX(Demo d){
		this.x = this.x + d.x;
	}
	
	Demo valueMultiplied(Demo d){
		d.x = this.x * d.x;
		return d;
	}
}
class P9{

	public static void main(String[] args){
		
		Demo d1 = new Demo();
		Demo d2 = new Demo(15);
		System.out.println("Before change d1.x = " + d1.x);
		d1.changeX(d2); // changing the value of X in Object d1 by passing and object d2
		System.out.println("After change d1.x = " + d1.x);
		
		Demo d3 =  new Demo(30);
		Demo d4 = d3.valueMultiplied(d2); // returns an object
		
		System.out.println("d4.x : " + d4.x); // 30*15 = 450
	}
}

