import java.util.*;

public class Apax {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      String input = in.nextLine();
      String result = "";
      for (int i = 0; i < input.length() - 1; i++) {
         while ((i != input.length() - 1)
               && (input.charAt(i) == input.charAt(i + 1))) {
            i++;
         
         }
         
         result += input.charAt(i);
            
         
         
         
         
      }
      if (input.charAt(input.length() - 1) == input.charAt(input.length() - 2)) {
         System.out.println(result);
      }
      else {
         System.out.println(result + input.charAt(input.length() - 1));
      }
   }

}