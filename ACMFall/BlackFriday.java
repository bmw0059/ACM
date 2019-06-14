import java.util.*;

public class BlackFriday {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      ArrayList<Integer> input = new ArrayList<Integer>();
      ArrayList<Integer> copy = new ArrayList<Integer>();   
      for (int i = 0; i < n; i++) {
         input.add(in.nextInt());
         copy.add(input.get(i));
      }
   
      
      //Search for duplicated
      HashSet<Integer> duplicated = new HashSet<>();
      Collections.sort(copy);
      for (int i = 0; i < input.size() - 1; i++) {
         if (copy.get(i) == copy.get(i + 1)) {
            duplicated.add(copy.get(i));
         }
      }
      
      //Search for not duplicated
      ArrayList<Integer> unique = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         if (!duplicated.contains(input.get(i))) {
            unique.add(input.get(i));
         }
      }
      
      //Do something if all duplicated
      if (unique.size() == 0) {
         System.out.println("none");
      }
      
      int biggest = unique.get(0);
      for (int i = 1; i < unique.size(); i++) {
         if (unique.get(i) > biggest) {
            biggest = unique.get(i);
         }
      }
   
      for (int i = 0; i < input.size(); i++) {
         if (input.get(i) == biggest) {
            System.out.println(i + 1);
         }
      }
      in.close();
   }      
}