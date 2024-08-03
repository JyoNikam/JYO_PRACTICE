package Interview3;

public class Interview3Que {
	int getSumOfCommonNum(int[] arr1, int[] arr2) {
		int sum = 0;
		// count=0;
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] == arr2[index]) {
				sum = sum + arr1[index];
				// count++;
			}
		}
		// System.out.println(count);
		// int avg= sum/count;
		// System.out.println(avg);
		return sum;
	}

	public static void main(String[] args) {
		int[] arr1 = { 79, 11, 34, 72, 9 };
		int[] arr2 = { 2, 9, 95, 34, 11 };
		Interview3Que interview3Que = new Interview3Que();
		int output = interview3Que.getSumOfCommonNum(arr1, arr2);
		System.out.println(output);
	}
}
