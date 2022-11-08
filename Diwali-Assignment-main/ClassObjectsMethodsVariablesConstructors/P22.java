// Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method

class P22{
	
	double balance;
	int AccNo;
	static double roi;
	
	P22(){
		balance = 0.0;
		AccNo = 0;
		roi = 2.5;
	}
	
	P22(double balance, int AccNo){
		this();
		this.balance = balance;
		this.AccNo = AccNo;
	}
	
	static void roiDetails(){
		System.out.println("Rate of Interest : " + roi + "%");
		// can access only static members(variables/methods)
		
		// balance++; // not allowed: non-static variable balance cannot be referenced from a static context	
	}
	
	void printDetail(){
		System.out.println("Account Number: " + AccNo);
		System.out.println("Balance: " + balance);
		roiDetails(); // can access both static and non static members(variables/methods)
		// System.out.println("Rate of Interest : " + roi); 
	}
	
	public static void main(String[] args){
		
		P22 obj1 = new P22(15000.56, 1);
		P22 obj2 = new P22(42050.468, 2);
		P22 obj3 = new P22(35120.058, 3);	
		
		obj1.printDetail();
		obj2.printDetail();
		obj3.printDetail();
	}
	
}

// each object will have its own instance variables
// can be used to assign unique values to the object
// these data constitute the state of the object