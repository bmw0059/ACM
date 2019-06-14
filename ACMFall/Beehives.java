import java.util.*;

public class Beehives {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      while (in.hasNext()) {
         float distance = in.nextFloat();
         int n = in.nextInt();
         
         if ((distance == 0) && (n == 0)) {
            break;
         }
         
         int sour = 0;
         int sweet = 0;
      
         float[] x = new float[n];
         float[] y = new float[n];
      
      
         for (int i = 0; i < n; i++) {
            float currentX = in.nextFloat();
            float currentY = in.nextFloat();
         
                        
            x[i] = currentX;
            y[i] = currentY;
         }
         
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if ((i == j) && (i != (n - 1))){
                  continue;
               }
            
               float xDistance = x[i] - x[j];
               float yDistance = y[i] - y[j];
               double currentDistance = Math.sqrt((xDistance * xDistance) + 
                  (yDistance * yDistance));
               
               if ((currentDistance < distance) && (i != j)) {
                  sour++;
                  break;
               }
               else if (j == (n - 1)) {
                  sweet++;
               }
            } 
            
            
         }
         
         System.out.println(sour + " sour, " + sweet + " sweet");
      }
      in.close();
   }
}

/*
if the distance between 2 is less than 10, sour
d = sqrt(x ^2 + y^2)



*/