package daiman;

public class Main {

	public static void main(String[] args) {
		int start = 0;
		int end = 100;
        String skipByThree = "foo";
        String skipByFive = "bar";
        int[] arr = {3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60,63,66,69,72,75,78,81,84,87,90,93,96,99};
		
		
		for (int current = start; current <= end; current++) {
			System.out.println(current);
			
		for (int i : arr) {
			if (current == i) {
				System.out.println(skipByThree);
				}}
          

		}
	}

}
