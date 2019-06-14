import java.util.*;

public class Trik {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
   
      String input = in.next();
      int[] cups = {1, 0, 0};
      
      for (int i = 0; i < input.length(); i++) {
         if (input.charAt(i) == 'A') {
            int temp = cups[0];
            cups[0] = cups[1];
            cups[1] = temp;
         }
         if (input.charAt(i) == 'B') {
            int temp = cups[1];
            cups[1] = cups[2];
            cups[2] = temp;
         }   
         if (input.charAt(i) == 'C') {
            int temp = cups[0];
            cups[0] = cups[2];
            cups[2] = temp;
         }
      }
      
      for (int j = 0; j < 3; j++) {
         if (cups[j] == 1) {
            System.out.println(j + 1);
         }
      }
      in.close();
   }
   
}