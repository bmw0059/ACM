import java.util.*;

public class Cold {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int lessThanZero = 0;
      for (int i = 0; i < n; i++) {
         int temp = in.nextInt();
         if (temp < 0) {
            lessThanZero++;
         }
         
      }
      System.out.println(lessThanZero++);
   in.close();
   
   
   }

}