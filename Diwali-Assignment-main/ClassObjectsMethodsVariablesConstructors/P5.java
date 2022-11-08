//5. Java Program to Illustrates Use of Referencing the Object from Inner Class

class Outer{
	int regId;
	String documentName;
	

	Outer(){}

	Outer(int regId, String documentName){
		this.regId=regId;
		this.documentName = documentName;
		//object of Outer class is being created from static inner class Inner.
	}

	void displayOuterDetails(){
		System.out.println("Details from outer class, Registrartion ID: "+regId+" Name of document provided: "+documentName);
	}

	static class Inner{
		
		static Outer outerClassObj;
		Inner(){}

		Inner(int regId, String documentName){
			outerClassObj = new Outer(regId, documentName);
			//in the above line object of outer class Outer is being created
		}

		void innerClassMethod(){
			System.out.println("calling displayOuterDetails method (method of outer class) from Inner class");
			outerClassObj.displayOuterDetails();
			// form above line we are referencing Outer class object from inner class.
		}

	}
}
// Q5ReferencingFromInnerClass
class P5{
	public static void main(String[] args){
		// creating static inner class object with help of Outer class 

		Outer.Inner innerClassObj = new Outer.Inner(12300, "Passport");
		innerClassObj.innerClassMethod();
	}
}