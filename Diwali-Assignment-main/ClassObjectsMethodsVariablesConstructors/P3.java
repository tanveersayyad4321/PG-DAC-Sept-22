// 3. Java Program to Illustrates Use of Instance Inner Class

class University{
	String nameOfUniv = "abc university";
	University(){
		System.out.println("entered University campus......");
	}
	
	// instance inner class Department
	class Department{
		String nameOfDept = "Engineerring";
		int estbyear = 2000;
		int numberOfLabs = 10;
		Department(){
			System.out.println("entered Engineering department via campus gate, you can access labs now...");
		}
		
	}
}
// Q3NewStudent
public class P3{
	public static void main(String[] args){
		// suppose a new student want to access Engineering labs of university abc
		// the only way to access that is through Class university
		University gate1 = new University();
		// once student enter university he/she can access different dept. availavle there 
		// but to visit a specific dept student must enter through a correct gate 
		
		//Department engg=new Department(); // ----- Error 1: -- check below comment secton for details.
		
		// in above line new student is trying to directly acessing Department it is not possible. new student must go via University gate to enter various departments(here engineering). 
		
		University.Department engg=gate1.new Department(); // no compilation error
		// in the above example new student enterred University via University gate and then via Department gate(engg object) and now can access its lab and other data(places and details);
		System.out.println("number of labs:	"+engg.numberOfLabs);
		
		/*
		central Idea: 
			whenever there is requirement like without existing a class there is no point of existing other class 
			in that case we can use inner classes. here no point of existing Department class without University class.
			Addition to this if our requirement is that the dependent class can have different instances in that 
			case we declare inner(dependent class) instance. here Department class may have various departments.
		*/
	}
}

/*
Error 1:
		 error: cannot find symbol
                Department engg=new Department();
                ^
  symbol:   class Department
  location: class Student
  
*/