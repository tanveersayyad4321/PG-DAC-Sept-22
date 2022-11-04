/* 10. Given a string representing your stones and another string representing a list of jewels, 
return the number of stones that you have that are also jewels.
Ex: Given the following jewels and stones...
jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0 */


import java.util.Scanner;
class p10
{
	public static int numJewelsInStones(String jewels, String stones) 
    {
        int count=0;
        for(char c:stones.toCharArray())
        {
            if(jewels.indexOf(c)!=-1)
                count++;
        }
        return count;
    }
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(numJewelsInStones(str1,str2));
}	
}