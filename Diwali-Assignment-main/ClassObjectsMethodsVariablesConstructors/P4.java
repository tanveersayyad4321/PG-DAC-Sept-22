// 4. Java Program to Illustrates Use of Static Inner Class

class UniversityHostel{
	String nameOfUniv = "abc university";
	UniversityHostel(){
		System.out.println("entered University campus hostel......");
	}
	
	// instance inner class Department
	static class Playground{
		
		Playground(){
			System.out.println("Acessing playground...");
		}
		
	}
	static class Library{
		
		Library(){
				System.out.println("Acessing Library...");
			}
			static void universityLibrary(){
				System.out.println("acessing university library...");
			}
		}
		
}

// Q4HostelStudent
 class P4{
	public static void main(String[] args){
		// suppose a hostel student want to access palyground of university abc
		// if the playground is within university campus then for hostel students it is not required to show student ids to access playground 
		UniversityHostel.Playground team1 = new UniversityHostel.Playground();
		// here in above line team1 of hostel student acessed university Playground by just using their university name 
		//i.e . static inner clas can be acessed or used just by name of outer class name.
		// there is no need to create object of inner class to use it every time.
		
		UniversityHostel.Library.universityLibrary();// acessing static method of static inner class
		
		
		/*
		central Idea: 
			whenever requirement is of such type in which to user want to use inner class without help 
			any reference of outer class then we can go for static inner classes(when trying to use 
			from some other outside class)
			we can also declare static methods inside static inner class which is not possible in instance 
			inner class.
		*/
	}
}