import java.util.*;

public class OddManOut {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      int duplicate = 0;
      int n = in.nextInt();
      for (int i = 0; i < n; i++) {
         int g = in.nextInt();
         int[] array = new int[g];
         for (int j = 0; j < g; j++) {
            array[j] = in.nextInt();
         }
         
         Arrays.sort(array);
         for (int j = 0; j < g; j++) {
            if (j == g - 1){
               duplicate = array[j];
               break;
            }
            if (array[j] != array[j + 1]) {
               duplicate = array[j];
               break;
            }
            j++;
         }
         System.out.println("Case #" + (i + 1) + ": " + duplicate);
      
      }
   in.close();
   }

}