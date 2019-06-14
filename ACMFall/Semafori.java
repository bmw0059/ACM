import java.util.*;

public class Semafori {
   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      int light = in.nextInt();
      int road = in.nextInt();
      int timer = 0;
      int previousD = 0;
      
      for (int i = 0; i < light; i++) {
         int d = in.nextInt();
         int r = in.nextInt();
         int g = in.nextInt();
         
         timer += d - previousD;
         while ((timer % (g + r)) < r) {
            timer++;
         }
         previousD = d;
         
         
      }
   
      System.out.println(timer + (road - previousD));
      in.close();
   }

}

/*
is the light green?
0 0 0 0 0 1 1 1 1 1 0 0 0 0 0 1 1 1 1 1
when timer is 6-10, 16-20

cycle = green + red

if timer % cycle > r
   isGreen
 

*/