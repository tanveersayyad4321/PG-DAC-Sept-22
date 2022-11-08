//  Java Program to Implement the Passing and Returning Objects

class Demo{
	
	int no;
	
	Demo() { }
	
	Demo(int no){
		this.no = no;
	}
	
	
}
class P10{
	
	public static void swap(Demo obj1, Demo obj2){
		
		int temp = obj1.no;
		obj1.no = obj2.no;
		obj2.no = temp;
		
	}

	public static void main(String[] args){
		
		Demo obj1 = new Demo(1);
		Demo obj2 = new Demo(2);
		
		System.out.println("Before swapping:");
		System.out.println("obj1.no = " + obj1.no);
		System.out.println("obj2.no = " + obj2.no);
		
		swap(obj1, obj2);
		
		System.out.println("After swapping:");
		System.out.println("obj1.no = " + obj1.no);
		System.out.println("obj2.no = " + obj2.no);
		
	}
}

