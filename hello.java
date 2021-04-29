import java.util.*;
public class hello
{
   static Scanner console = new Scanner (System.in);
   public static void main (String[] args)
   {
      int num;
      String x = "";
      
      
      System.out.println("Enter an integer number between 0 and 35");
      num= console.nextInt();
      
      if (num<=9)
         System.out.println(num);
      else
         System.out.println((char)(num+55));
      x += "tro";
      x += "lolo";
      System.out.println(x);
      
      
   
   }
}
