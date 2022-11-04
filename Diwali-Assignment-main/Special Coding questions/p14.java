/* Q 14 */

import java.util.*;
class p14 {
 
   
    static int getTimeInSeconds(String str) {
 
        String[] curr_time = str.split(":");
        int t = Integer.parseInt(curr_time[0]) * 60 * 60 + (Integer.parseInt(curr_time[1]) * 60);
 
        return t;
    }
 
    
    static String convertSecToTime(int t) {
        int hours = t / 3600;
        String hh = hours < 10 ? "0" + Integer.toString(hours) : Integer.toString(hours);
        int min = (t % 3600) / 60;
        String mm = min < 10 ? "0" + Integer.toString(min) : Integer.toString(min);
      
        String ans = hh + ":" + mm ;
        return ans;
    }
 
   
    static String timeGap(String st, String et) {
 
        int t1 = getTimeInSeconds(st);
        int t2 = getTimeInSeconds(et);
 
        int time_diff = (t1 - t2 < 0) ? t2 - t1 : t1 - t2;
 
        return convertSecToTime(time_diff);
    }
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		System.out.println(timeGap(str1,str2));
	}
}