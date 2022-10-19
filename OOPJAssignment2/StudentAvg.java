class Student
{
	int science,math,history,total,avg;
	String name;
	
	Student(){}
	
	Student(String name,int science,int math,int history)
	{
		this.name=name;
		this.science=science;
		this.math=math;
		this.history=history;
	}
	void totalAverage()
	{
		total= science+math+history;
		avg=total/3;
	}
	void display()
	{
		System.out.println("Student Name : "+name);
		System.out.println("Total Marks : "+total);
		System.out.println("Average of Marks : "+avg);

	}
	
}
class StudentAvg
{
	public static void main(String [] args)
	{
		Student s[]=new Student[2];
		
		s[0]=new Student("Ramesh",12,25,30);
		s[1]=new Student("Suresh",25,30,45);
		
		for(int i=0;i<s.length;i++)
		{
			s[i].totalAverage();
			s[i].display();
		}
	}
	
}