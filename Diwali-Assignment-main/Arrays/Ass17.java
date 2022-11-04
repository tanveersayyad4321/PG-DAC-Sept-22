import java.util.*;
class Ass17
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
      int ele=sc.nextInt();
      for(int i=1;i<99;i++)
      {
          int j=sc.nextInt();
          ele=ele^j;
      }
      for(int i=1;i<=100;i++)
           ele=ele*i;
      System.out.println(ele);
  }
}