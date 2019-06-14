import java.util.*;

public class DigitSum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			long a = in.nextLong();
			long b = in.nextLong();
			System.out.println(ds(a, b));
		}
				
		
		in.close();

	}

	private static long ds(long a, long b) {
		long result = 0;
		while (a <= b) {
			String s = String.valueOf(a);
			for (int i = 0; i < s.length(); i++) {				
				result +=  Character.getNumericValue(s.charAt(i));
			}
					
			a++;
		}
		
		return result;
	}
	
	
}
