package Interview3;

public class Interview3Que5_2 {
	void getMiddleChar(String name) {
		int length = name.length();
		String output = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (index == length / 2) {
				output = String.valueOf(Character.toUpperCase(ch));
			}
		}
		System.out.println(name + "-> " + output);
	}

	public static void main(String[] args) {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Interview3Que5_2 interview3Que5_2 = new Interview3Que5_2();
		for (int index = 0; index < arr.length; index++) {
			interview3Que5_2.getMiddleChar(arr[index]);
		}
	}
}
