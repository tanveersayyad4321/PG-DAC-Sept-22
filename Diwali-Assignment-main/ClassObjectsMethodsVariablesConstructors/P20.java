// String Constructor Program in Java

class P20{
	
	public static void main(String args[]){
	
		String str1 = new String("Hello World"); 
		String str2 = new String("Hello World"); // creates a new obj in heap, even thou content is same with str1
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));		

	}
}
