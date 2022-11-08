// Java Program to Illustrate Use of All Features of Abstract Class

abstract class Base{ // an abstract class can have zero or more abstract methods
	Base(){
		System.out.println("Inside Base Constructor");
	}
	abstract void fun1(); // abstract method must be overriden in the implementing class
	
	void fun2(){ // non-abstract methods need not be overriden
		System.out.println("fun2 only belongs to Base and is not overriden");
	}
	
	final void fun3(){ // abstract class can have final methods
		System.out.println("fun3 cannot be overriden in the Derived class");
	}
	
	static void fun4(){ // abstract method can have static methods too
		System.out.println("Static method fun4 of Base Class");
	}
	
	abstract void fun5();
	abstract void fun6();
}

abstract class Derived extends Base{ // made abstract because it hasn't implemented fun5, fun6 abstract methods of Base class
	
	Derived(){
		System.out.println("Inside Derived Constructor");
	}
	
	void fun1(){
		System.out.println("fun1 implementation");
	}
	
	static void fun4(){ // method hiding
		System.out.println("Static method fun4 of Derived Class");
	}
	
}

class DerivedsClass extends Derived{ // need not implemented fun1 because that is done in Derived class
	void fun5(){
		System.out.println("fun5 implementation in DerivedsClass");
	}
	
	void fun6(){
		System.out.println("fun5 implementation in DerivedsClass");
	}
}

class P1{
	public static void main(String[] args){
		// Base b1 = new Base(); //  CE : Base is abstract; cannot be instantiated
		
		/*Base b2 = new Derived();
		b2.fun1(); // fun1 implementation*/
		
		/*
		Derived d1 = new Derived();
		d1.fun1(); // fun1 implementation
		d1.fun2(); // fun2 only belongs to Base and is not overriden
		b2.fun4(); // Static method fun4 of Base Class*/
		
		Base b3 = new DerivedsClass();
		b3.fun5();
		b3.fun6();
		
		
	}
}