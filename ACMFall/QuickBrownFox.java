import java.util.*;

public class QuickBrownFox {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      int n = Integer.parseInt(in.nextLine());
      for (int i = 0; i < n; i++) {
         
         String input = in.nextLine();
         input = input.toLowerCase();
         char[] missing = new char[26];
         int size = 0;
         for (char myChar = 'a'; myChar <= 'z'; myChar++) {
         
            for (int j = 0; j < input.length(); j++) {
            
               if (myChar == input.charAt(j)) {
                  break;
               }
               if (j == input.length() - 1) {
                  missing[size] = myChar;
                  size++;
               }
            }
         }
         String result = "";
         for (int j = 0; j < size; j++) {
            result += missing[j];
         }
         
         if (size == 0) {
            System.out.println("pangram");
         }
         else {
            System.out.println("missing " + result);
         }
         
      }
   
   in.close();
   }

}