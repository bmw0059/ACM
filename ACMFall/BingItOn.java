import java.util.*;

public class BingItOn {


   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      int n = Integer.parseInt(in.next());
      ArrayList<String> a = new ArrayList<>();
      for (int i = 0; i < n; i++)
      {
         int words = 0;
         String current = in.next();
         a.add(current);
         for (String s : a) {
            if (startsWith(current, s)) {
               words++;
            }
               
         
         }
      
         System.out.println(words - 1);
      }
   
   }


   public static boolean startsWith(String current, String s) {
   
      for (int i = 0; (i < current.length() && i < s.length()); i++) {
      
         if ((i == current.length() - 1) && (s.charAt(i) == current.charAt(i))) {
            return true;
         }
         if (s.charAt(i) == current.charAt(i)) {
            continue;
         }
         else {
            return false;
         }
      
      }
      return false;
   }

}