package Interview3;

public class Interview3Que5 {
	void getSumOfNumbers(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(name + "-> " + sum);
	}

	public static void main(String[] args) {
		String[] arr = { "Sa2yl4i", "d1ee6pa9k", "Ni9ve2di4ta", "Y79oge3s4h" };
		Interview3Que5 interview3Que5 = new Interview3Que5();
		for (int index = 0; index < arr.length; index++) {
			interview3Que5.getSumOfNumbers(arr[index]);
		}
	}
}
