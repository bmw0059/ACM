import java.util.*;

public class Aaah {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      String d = in.nextLine();
      
      if (s.length() < d.length()) {
         System.out.println("no");
      }
      else {
         System.out.println("go");
      }
   
   in.close();
   }

}