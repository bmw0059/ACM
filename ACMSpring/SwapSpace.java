import java.util.*;

public class SwapSpace {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] original = new int[n];
		int[] formatted = new int[n];
		int totalSpace = 0;
		int currentSpace = 0;
		
		for (int i = 0; i < n; i++) {
			original[i] = in.nextInt();
			formatted[i] = in.nextInt();
			totalSpace += original[i];
		}
		in.close();
		currentSpace = totalSpace;
		
		int min = original[minIndex(original)];
		int minAfter = formatted[minIndex(original)];
		int spaceGained = minAfter - min;
		if (spaceGained >= 0) {
			format(original, formatted, minIndex(original));
		}
		
	
	}
	
	public static void format(int[] original, int[] formatted, int index) {
		original[index] = formatted[index];
	}
	
	//return the index of the minimum value of the original array
	public static int minIndex(int[] original) {
		int result = 0;
		for (int i = 0; i < original.length; i++) {
			if (original[i] < original[result]) {
				result = i;
			}
		}
		return result;
	}
	
}
