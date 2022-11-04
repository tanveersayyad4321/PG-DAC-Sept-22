/*3. This question is asked by Amazon. Given a string representing the sequence of moves a 
robot vacuum makes, return whether or not it will return to its original position. The 
string will only contain L, R, U, and D characters, representing left, right, up, and down 
respectively.
Ex: Given the following strings...
"LR", return true
"URURD", return false
"RUULLDRD", return true*/

import java.util.Scanner;
class p3
{    
   public static boolean Check(String moves) {
	   
        int x=0,y=0;
        for(int i=0;i<moves.length();i++)
        {
            char el=moves.charAt(i);
            
            if(el=='L')
            {x++;}
            if(el=='R')
            {
                x--;
            }
            if(el=='U')
            {
                y++;
            }
            if(el=='D')
            {
                y--;
            }
            
            
            
        }
        return x==0 && y==0;
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Moves :  ");
		String str=sc.nextLine();
		
		System.out.print("Result : "+Check(str));
	}
}