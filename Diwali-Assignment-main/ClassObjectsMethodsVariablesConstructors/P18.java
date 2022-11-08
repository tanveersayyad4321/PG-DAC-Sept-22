// Java program to illustrate Constructor Chaining to
// using this() for same class and super() for parent class

class Base
{
	String name;

	// constructor 1
	Base()
	{
		this("");
		System.out.println("No-argument constructor of base class");
	}

	// constructor 2
	Base(String name)
	{
		this.name = name;
		System.out.println("Calling parameterized constructor of base");
	}
}

class Derived extends Base
{
	// constructor 3
	Derived()
	{
		System.out.println("No-argument constructor of derived");
	}

	// parameterized constructor 4
	Derived(String name)
	{
		// invokes base class constructor 2
		super(name);
		System.out.println("Calling parameterized constructor of derived");
	}

	
}

class P18{
	public static void main(String args[])
	{
		// calls parameterized constructor 4
		Derived obj = new Derived("test");

		System.out.println();

		// Calls No-argument constructor
		Derived obj2 = new Derived();
	}
}
