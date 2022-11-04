/* 6. Given an array of strings, return the longest common prefix that is shared amongst all 
strings.
7. Note: you may assume all strings only contain lowercase alphabetical characters.
Ex: Given the following arrays...
["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot" */


import java.util.Scanner;
class p6p7
{
	public static String longestCommonPrefix(String[] strs) 
	{
        String prefix = strs[0];
        
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix) != 0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String strarr[]=new String[3];
	System.out.println("Enter Strings : ");
	for(int i=0;i<3;i++)
	{
	strarr[i]=sc.nextLine();
	}
	System.out.println("Result : \""+longestCommonPrefix(strarr)+"\"");
}	
}