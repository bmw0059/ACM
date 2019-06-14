import java.util.*;
class UVA382 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		while (in.hasNext()){
			int n = in.nextInt();
			if (n == 0) {
				System.exit(1);
			}
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(in.nextInt());
			}
			for (Integer a : list) {
				for (Integer b : list) {
					for (Integer c : list) {
						for (Integer d : list) {
							for (Integer e : list) {
								for (Integer f : list) {
									if ((a < b) && (b < c) && (c < d) && (d < e) && (e < f)) {
										System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
									}
								}
							}
						}
					}
				}
			}
			
		}
		
	}
	
}
