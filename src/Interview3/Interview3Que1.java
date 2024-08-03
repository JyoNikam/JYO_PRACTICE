package Interview3;

public class Interview3Que1 {
	int getCommonNumbers(int[] arr1, int[] arr2) {
		int sum = 0;
		// count = 0;

		for (int index = 0; index < arr1.length; index++) {
			for (int innerIndex = 0; innerIndex < arr2.length; innerIndex++) {
				if (arr1[index] == arr2[innerIndex]) {
					sum = sum + arr1[index];
					// count++;
				}
			}

		}
		// System.out.println(sum);
		// System.out.println(count);
		// int avg= sum/count;
		// System.out.println(avg);
		return sum;
	}

	public static void main(String[] args) {
		int[] arr1 = { 79, 11, 34, 72, 9 };
		int[] arr2 = { 2, 9, 95, 34, 11 };
		Interview3Que1 interview3Que1 = new Interview3Que1();
		int output = interview3Que1.getCommonNumbers(arr1, arr2);
		System.out.println(output);
	}
}
