import java.util.*;

public class Bijele {

   public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      
      int kings = in.nextInt();
      int queens = in.nextInt();
      int rooks = in.nextInt();
      int bishops = in.nextInt();
      int knights = in.nextInt();
      int pawns = in.nextInt();
      
      int k = 1;
      int q = 1;
      int r = 2;
      int b = 2;
      int kn = 2;
      int p = 8;
      
      System.out.print(k - kings);
      System.out.print(" ");
      System.out.print(q - queens);
      System.out.print(" ");
      System.out.print(r - rooks);
      System.out.print(" ");
      System.out.print(b - bishops);
      System.out.print(" ");
      System.out.print(kn - knights);
      System.out.print(" ");
      System.out.print(p - pawns);
      
      
      in.close();
   }
}