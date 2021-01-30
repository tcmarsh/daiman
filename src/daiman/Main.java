package daiman;

public class Main {

	public static void main(String[] args) {
		int start = 0;
		int end = 100;
        String skipByThree = "foo";
        String skipByFive = "bar";
        int[] arr1 = {3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60,63,66,69,72,75,78,81,84,87,90,93,96,99};
        int[] arr2 = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};
		
		
		for (int current = start; current <= end; current++) {
			System.out.println(current);	
			
		for (int i : arr1) {
			if (current == i) {
				System.out.println(skipByThree);
				}}
		
		for (int i : arr2) {
			if (current == i) {
				System.out.println(skipByFive);
				}}
          

		}
	}

}
