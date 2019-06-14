import java.util.*;

public class CircleArea {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      while (in.hasNext()) {
         double r = Double.parseDouble(in.next());
         double m = Double.parseDouble(in.next());
         double c = Double.parseDouble(in.next());
         
         if (r == 0 && m == 0 && c == 0) {
            break;
         }
         
         
         double k = c / m;
         double a = Math.pow(r * 2, 2);
         
            
         System.out.println(Math.PI * Math.pow(r, 2) + " " + (a * k));     
         
      }
   in.close();
   }
   
}