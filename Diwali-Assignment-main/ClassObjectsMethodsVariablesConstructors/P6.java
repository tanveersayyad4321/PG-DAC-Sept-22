//6. Java Program to Create Outer Class Bank Account and the Inner Class Interest in it

class BankAccount{
	String accountHolderName = "User1";
	long accountNumber = 1234567891011L;
	double totalBalance = 52500.00;

	class Interest {
		double interestRate=5.0;
		double interestEarned=2500.00 ;
	}

}
// Q6BankInterest
class P6{
	public static void main(String[] args){
		// access Account holder's name, account number and total balance
		BankAccount user1 = new BankAccount();
		System.out.println("Name of Account Holder: "+user1.accountHolderName);
		System.out.println("Account Number: "+user1.accountNumber);
		System.out.println("Total Availavle Balance: "+user1.totalBalance);

		// accessing interestRate and interest earned
		// System.out.println("Interst rate; "+interestRate); // Error 1 (Please check below comment section)
		// System.out.println("Interest earned: "+interestEarned); // Error 2 (Please check below comment section)

		BankAccount.Interest interestDetails = user1.new Interest(); // created inner class object with help of outer class object.

		// accessing interestRate and interest earned through inner class object interestDetails
		System.out.println("Interst rate; "+interestDetails.interestRate); // Error 1 (Please check below comment section)
		System.out.println("Interest earned: "+interestDetails.interestEarned); // Error 2 (Please check below comment section)
	}
}

/*	
	Error 1:
	error: cannot find symbol
	                System.out.println("Interst rate; "+interestRate);
	                                                    ^
	  symbol:   variable interestRate
	  location: class Q6BankInterest

	Error 2:
	error: cannot find symbol
                System.out.println("Interest earned: "+interestEarned);
                                                       ^
  symbol:   variable interestEarned
  location: class Q6BankInterest

  Explaination of Error 1 & Error 2-
  	- since both the variables interestRate and interestEarned are inside instance class Interest
  	which is an inner class of class BankAccount hence we cannot access these two contents
  	directly through outer class object reference from some other outside class.
  	To access these variables it is mandatory to create inner class object.
  	while accssing these variables using inner class objects it got accessed(no more error)
*/