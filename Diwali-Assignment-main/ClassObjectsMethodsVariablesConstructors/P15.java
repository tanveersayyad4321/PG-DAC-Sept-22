//  Java Program to Illustrate the Use of HashCode() Method

class Demo{
	
	int x;
	
	Demo() { }
	
	Demo(int x){
		this.x = x;
	}
	
	public int hashCode(){
		return x;
	}
	
	public boolean equals(Object obj){
		Demo d = (Demo)obj;
		if(this.x == d.x){
			return true;
		}
		return false;
	}

}
class P15{

	public static void main(String[] args){
		
		Demo d1 = new Demo(5);
		Demo d2 = new Demo(5);
		Demo d3 = new Demo(7);
		/*
		// Outputs before overridding the equals method		
		System.out.println("d1.equals(d2) : " + (d1.equals(d2))); // false :  without overriding equals method : Shallow Comparision takes place.
		
		System.out.println("d1.hashCode(): " + d1.hashCode()); // 705927765
		System.out.println("d2.hashCode(): " + d2.hashCode()); // 366712642
		*/
		
		// after overriding equals method : Deep Comparision
		System.out.println("d1.equals(d2) : " + (d1.equals(d2))); // true
		System.out.println("d1.equals(d3) : " + (d1.equals(d3))); // true
		
		// when equals() method is overridden its responsibility of programmer to override the hashCode method.
		// equal objects must have the same hashCode()
		System.out.println("d1.hashCode(): " + d1.hashCode()); // 5
		System.out.println("d2.hashCode(): " + d2.hashCode()); // 5
		System.out.println("d3.hashCode(): " + d3.hashCode()); // 7
	
	}
}

