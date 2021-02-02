package daiman;

public class Main {

	public static void main(String[] args) {
		int start = 0;
		int end = 100;
		String skipByThree = "foo";
		String skipByFive = "bar";
		int[] arr2 = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100 };

		for (int current = start; current <= end; current++) {
			boolean notFoundInArrays = true;

			if (current % 3 == 0) {
				System.out.println(skipByThree);

				notFoundInArrays = false;
			}

			for (int i : arr2) {
				if (current == i) {
					System.out.println(skipByFive);

					notFoundInArrays = false;
				}
			}

			if (notFoundInArrays) {
				System.out.println(current);
			}

		}
	}

}
