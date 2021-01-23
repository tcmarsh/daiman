package daiman;

public class Main {

	public static void main(String[] args) {
		int start = 0;
		int end = 100;
        String skipByThree = "foo";
        String skipByFive = "bar";
		
		
		for (int current = start; current <= end; current++) {
			System.out.println(current);
			current = current + 2;
            System.out.println(skipByThree);

		}
	}

}
