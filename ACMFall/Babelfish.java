import java.util.*;
import java.io.*;

public class Babelfish {
   
   public static void main(String[] args) throws IOException {
   
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String line = in.readLine();
      
      Map<String, String> dictionary = new HashMap<String, String>();
   
      while (!line.equals("")) {
         StringTokenizer splitterator = new StringTokenizer(line);
         String englishWord = splitterator.nextToken();
         String foreignWord = splitterator.nextToken();
         
         //Build the dictionary
         dictionary.put(foreignWord, englishWord);
         
         line = in.readLine();
      }
   
      while(in.ready()) {
         line = in.readLine();
         
         if (dictionary.containsKey(line)) {
         
         // Print the english word mapped to by "line"
            System.out.println(dictionary.get(line));
         }
         else {
            System.out.println("eh");
         }
      }
   }
}