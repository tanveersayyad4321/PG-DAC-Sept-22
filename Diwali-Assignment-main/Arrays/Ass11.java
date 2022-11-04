import java.util.*;
class Ass11 {
    public static void main(String[] args)
    {
  
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        try {
  
            byte[] input = str.getBytes();
            String str1 = new String(input);
            System.out.println(str1);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}