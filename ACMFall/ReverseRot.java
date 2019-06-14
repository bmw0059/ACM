import java.util.*;

public class ReverseRot {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      while (in.hasNext()) {
         int n = Integer.parseInt(in.next());
         if (n == 0) {
            break;
         }
         String s = in.next();
         s = reverse(s);
         String result = "";
         
         for (int i = 0; i < s.length(); i++) {
            int current = s.charAt(i);
            for (int k = 0; k < n; k++) {
               
               if (current == 95) {
                  current = 91;
               }
               if (current == 46) {
                  current = 92;
               }
               
               
               current++;
               if (current == 93) {
                  current = 65;
               }
            
            }
            if (current == 91) {
               current = 95;
            }
            if (current == 92) {
               current = 46;
            }
            result += (char) current;
         }
      
      
         System.out.println(result);
      
      
      
      }
   }


   public static String reverse(String s) {
      String result = "";
      for (int j = s.length() - 1; j >= 0; j--) {
         result += s.charAt(j);
      }
      
      return result;
   
   }

}