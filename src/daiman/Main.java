package daiman;

public class Main {

	public static void main(String[] args) {
		int start = 0;
		int end = 5;
		
		for (int current = start; current <= end; current++) {
			if (current % 3 == 0) {
				System.out.println("foo");
			}
			else {
				System.out.println(current);
			}
		}
	}

}
