import java.util.*;

public class PlantingTrees {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      int n = Integer.parseInt(in.nextLine());
      int[] a = new int[n];
      int days = 0;
      for (int i = 0; i < n; i++) {
         a[i] = Integer.parseInt(in.next());
      }
      Arrays.sort(a);
      //reverse the array
      int j = n - 1;
      for (int i = 0; i <= j; i++, j--) {
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
      }
      
      for (int i = 0; i < n; i++) {
         int max = a[i] + i + 2;
         if (max > days) {
            days = max;
         }
      }
      System.out.println(days);
   in.close();
   }


}

/*
2 3 4 3
2 3 3 4

4 3 3 2

*/