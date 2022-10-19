class Books
{
	String title;
	String authors[]=new String[5];
	int noOfPages;
	double price;
	String publisher;
	
	Books(){}
	
	/*
	Books(String title,int noOfPages,double price,String publisher)		//using constructor add books
	{
		this.title=title;
		this.noOfPages=noOfPages;
		this.price=price;
		this.publisher=publisher;
	}
	*/
	
	void addBooks(String title,int noOfPages,double price,String publisher)		//using method add books
	{
		this.title=title;
		this.noOfPages=noOfPages;
		this.price=price;
		this.publisher=publisher;
	
	}
	int remove()
	{
		return 0;
	}
	
	
}

class Library
{
	public static void main(String []args)
	{
		Books b[]=new Books[5];		//use array of object
		b[0]=new Books();
		b[1]=new Books();
		b[2]=new Books();
		b[3]=new Books();
		b[4]=new Books();
		
		/*	
		b[0]=new Books("Clean Code",464,1200,"Prentice Hall");
		b[0].authors[0]="Robert C. Martin";
		
		b[1]=new Books("Introduction to Algorithms",1312,2160,"Prentice Hall");
		b[1].authors[0]="Thomas H. Cormen";
		b[1].authors[1]="Charles E. Leiserson";
		b[1].authors[2]="Ronald L. Rivest";
		b[1].authors[3]="Clifford Stein";
		
		b[2]=new Books("Design Patterns",416,6000,"Addison-Wesley Professional");
		b[2].authors[0]="Erich Gamma";
		b[2].authors[1]="Richard Helm";
		b[2].authors[2]="Ralph Johnson";
		b[2].authors[3]="John Vlissides";
		b[2].authors[4]="Grady Booch";
		
		b[3]=new Books(" The Pragmatic Programmer",352,3995,"Addison-Wesley Professional");
		b[3].authors[0]="Andrew Hunt";
		b[3].authors[1]="David Thomas";
	
		b[4]=new Books("Java 8 Programming",1055,720,"Dreamtech Press");
		b[4].authors[0]="D.T. Editorial Services"; 
		*/
		
		
		b[0].addBooks("Clean Code",464,1200,"Prentice Hall");
		b[0].authors[0]="Robert C. Martin";
		
		b[1].addBooks("Introduction to Algorithms",1312,2160,"Prentice Hall");
		b[1].authors[0]="Thomas H. Cormen";
		b[1].authors[1]="Charles E. Leiserson";
		b[1].authors[2]="Ronald L. Rivest";
		b[1].authors[3]="Clifford Stein";
		
		b[2].addBooks("Design Patterns",416,6000,"Addison-Wesley Professional");
		b[2].authors[0]="Erich Gamma";
		b[2].authors[1]="Richard Helm";
		b[2].authors[2]="Ralph Johnson";
		b[2].authors[3]="John Vlissides";
		b[2].authors[4]="Grady Booch";
		
		b[3].addBooks(" The Pragmatic Programmer",352,3995,"Addison-Wesley Professional");
		b[3].authors[0]="Andrew Hunt";
		b[3].authors[1]="David Thomas";
	
		b[4].addBooks("Java 8 Programming",1055,720,"Dreamtech Press");
		b[4].authors[0]="D.T. Editorial Services";
		
	
		double totalPrice=b[0].price+b[1].price+b[2].price+b[3].price+b[4].price;
		
		System.out.println("Total Price Of All Books: "+totalPrice);
		
		
	
	}
}
