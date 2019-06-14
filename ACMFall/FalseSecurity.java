import java.util.*;

public class FalseSecurity {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      String result = "";
   
      while (in.hasNext()) {
      
         String input = in.nextLine();
         String morse = toMorseCode(input);
         String reverse = reverse(morse);
         result = toEnglish(reverse);
         System.out.println(result);
      in.close();
      
      
      }
            
   }
  
  
   public static String toMorseCode(String in) {
   
      String code = "";
      String length = "";
      String input = in;
      @SuppressWarnings("resource")
	Scanner lineReader = new Scanner(input).useDelimiter("");
      while (lineReader.hasNext()) {
         char n = lineReader.next().charAt(0);
         switch (n) {
            case 'A':
               code += ".-";
               length += "2";
               break;
            case 'B':
               code += "-...";
               length += "4";
               break;
            case 'C':
               code += "-.-.";
               length += "4";
               break;
            case 'D':
               code += "-..";
               length += "3";
               break;
            case 'E':
               code += ".";
               length += "1";
               break;
            case 'F':
               code += "..-.";
               length += "4";
               break;
            case 'G':
               code += "--.";
               length += "3";
               break;
            case 'H':
               code += "....";
               length += "4";
               break;
            case 'I':
               code += "..";
               length += "2";
               break;
            case 'J':
               code += ".---";
               length += "4";
               break;
            case 'K':
               code += "-.-";
               length += "3";
               break;
            case 'L':
               code += ".-..";
               length += "4";
               break;
            case 'M':
               code += "--";
               length += "2";
               break;
            case 'N':
               code += "-.";
               length += "2";
               break;
            case 'O':
               code += "---";
               length += "3";
               break;
            case 'P':
               code += ".--.";
               length += "4";
               break;
            case 'Q':
               code += "--.-";
               length += "4";
               break;
            case 'R':
               code += ".-.";
               length += "3";
               break;
            case 'S':
               code += "...";
               length += "3";
               break;
            case 'T':
               code += "-";
               length += "1";
               break;
            case 'U':
               code += "..-";
               length += "3";
               break;
            case 'V':
               code += "...-";
               length += "4";
               break;
            case 'W':
               code += ".--";
               length += "3";
               break;
            case 'X':
               code += "-..-";
               length += "4";
               break;
            case 'Y':
               code += "-.--";
               length += "4";
               break;
            case 'Z':
               code += "--..";
               length += "4";
               break;
            case '_':
               code += "..--";
               length += "4";
               break;
            case ',':
               code += ".-.-";
               length += "4";
               break;
            case '.':
               code += "---.";
               length += "4";
               break;
            case '?':
               code += "----";
               length += "4";
               break;
            default:
               break;
         }   
      }
      
      String result = code + " " + length;
      return result;
      
   }
   
   //reverses the number string and puts it in front of the morse code
   public static String reverse(String in) {
      
      String finalLength = "";
      String result = "";
      Scanner myScanner = new Scanner(in);
      String morse = myScanner.next();
      String lengths = myScanner.next();
      for (int i = lengths.length() - 1; i >= 0; i--) {
         finalLength += lengths.charAt(i);
      }
      result = finalLength + " " + morse;
      myScanner.close();
      return result;
   }
  
   public static String toEnglish(String in) {
   
      String result = "";
      Scanner scan = new Scanner(in);
      String lengths = scan.next();
      String code = scan.next();
      int k = 0;
      @SuppressWarnings("resource")
	Scanner lscan = new Scanner(lengths).useDelimiter("");
      for (int i = 0; i < lengths.length(); i++) {
         int n = Integer.parseInt(lscan.next());
         String current = "";
         for (int j = 0; j < n; j++) {
            current += code.charAt(j + k);
         }
         k += n;
         switch (current) {
            case ".-":
               result += "A";
               break;
            case "-...":
               result += "B";
               break;
            case "-.-.":
               result += "C";
               break;
            case "-..":
               result += "D";
               break;
            case ".":
               result += "E";
               break;
            case "..-.":
               result += "F";
               break;
            case "--.":
               result += "G";
               break;
            case "....":
               result += "H";
               break;
            case "..":
               result += "I";
               break;
            case ".---":
               result += "J";
               break;
            case "-.-":
               result += "K";
               break;
            case ".-..":
               result += "L";
               break;
            case "--":
               result += "M";
               break;
            case "-.":
               result += "N";
               break;
            case "---":
               result += "O";
               break;
            case ".--.":
               result += "P";
               break;
            case "--.-":
               result += "Q";
               break;
            case ".-.":
               result += "R";
               break;
            case "...":
               result += "S";
               break;
            case "-":
               result += "T";
               break;
            case "..-":
               result += "U";
               break;
            case "...-":
               result += "V";
               break;
            case ".--":
               result += "W";
               break;
            case "-..-":
               result += "X";
               break;
            case "-.--":
               result += "Y";
               break;
            case "--..":
               result += "Z";
               break;
            case "..--":
               result += "_";
               break;
            case ".-.-":
               result += ",";
               break;
            case "---.":
               result += ".";
               break;
            case "----":
               result += "?";
               break;
         }
      }
      scan.close();
      return result;
   }
}
