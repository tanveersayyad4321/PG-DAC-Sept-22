// Java Program to Calculate Sum of Two Byte Values using Type Casting

class P26{
	
	public static void main(String[] args){
		
		byte num1 = 120; // 120 is within the range of byte -128 to 127
		byte num2 = 30;
		
		// byte res = num1 + num2; // error: incompatible types: possible lossy conversion from int to byte
		byte res = (byte)(num1 + num2);
		
		System.out.println("Res = " + res);
	}
	
}