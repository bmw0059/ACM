import java.util.*;

public class BusNumbers {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
         a[i] = in.nextInt();
      }
      Arrays.sort(a);
      
      String result = "";
      
      for (int i = 0; i < n; i++) {
         
         if ((i != n - 1) && ((a[i] + 1) == a[i + 1])) {
            if ((i != n - 2) && ((a[i + 1] + 1) != a[i + 2])){
               result += a[i];
            }
            else {
               int k = 0;
               if (i == (n - 2)) {
                  result += a[i] + " ";
                  continue;
               }
               while ((i != n - 2) && ((a[i + 1] + 1) == a[i + 2])) {
                  i++;
                  k++;
               }
               result += (a[i - k] + "-" + (a[i] + 1));
               i++;
            }
         }
         else {
            result += a[i];
         }
         if (i != (n - 1)) {
            result += " ";
         }
      }
      
      System.out.println(result);
   
   }

}

//sort, if consecutive integers rewrite