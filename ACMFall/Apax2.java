import java.util.*;

public class Apax2 {

   public static void main(String[] args) {
   
   
      Scanner in = new Scanner(System.in);
      String input = in.nextLine();
      
      if (input.length() == 1) {
         System.out.println(input);
      }
      else {
      
      
         String result = "";
         for (int i = 1; i < input.length(); i++) {
            if ((i != input.length() - 1) && (input.charAt(i) == input.charAt(i - 1))) {
            
            
            
            }
            else {
               result += input.charAt(i - 1);
            }
         }
         if (input.charAt(input.length() - 1) == input.charAt(input.length() - 2)) {
            System.out.println(result);
         }
         else {
            System.out.println(result + input.charAt(input.length() - 1));
         }
      }
   }

}