package Interview3;

public class Interview3Que5Counter {
	int getSumOfNumbers(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(name + "-> " + sum);
		return sum;
	}

	void getTotalSum(String[] arr) {
		int total = 0;
		for (int index = 0; index < arr.length; index++) {
			total = total + getSumOfNumbers(arr[index]);
		}
		System.out.println(total);
		// return total;
	}

	public static void main(String[] args) {
		String[] arr = { "Sa2yl4i", "d1ee6pa9k", "Ni9ve2di4ta", "Y79oge3s4h" };
		Interview3Que5Counter interview3Que5Counter = new Interview3Que5Counter();
		interview3Que5Counter.getTotalSum(arr);

	}
}
