package Interview3;

public class Assignment36Rev {
	void getPosAndNegNumber(int[] arr) {
		int count = 0, count1 = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				count++;
			} else if (arr[index] < 0) {
				count1++;
			}
		}
		System.out.println(count + "Positive Numbers are in given array");
		System.out.println(count1 + "Negative Numbers are in given array");
	}

	public static void main(String args[]) {
		int[] arr = { 10, -12, 4, 56, 77 };
		Assignment36Rev assignment36Rev = new Assignment36Rev();
		assignment36Rev.getPosAndNegNumber(arr);
	}
}
