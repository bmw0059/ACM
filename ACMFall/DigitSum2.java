import java.util.*;

public class DigitSum2 {
	
	//private Map<Long, Long> dsMap = new HashMap<>();
	
	public static long ds2(long a, long b) {
		
		long result = 0;
		String s = String.valueOf(a);

		for (int i = 0; i < s.length(); i++) {
			result += Character.getNumericValue(s.charAt(i));
		}
		if (a < b) {
			return result + ds2(++a, b);
		}
		else return result;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			long a = in.nextLong();
			long b = in.nextLong();
			System.out.println(ds2(a, b));
		}
		
		
		in.close();
	}
	
}
