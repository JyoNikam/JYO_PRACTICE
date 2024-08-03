package Interview3;

public class Interview3Que4 {
	void getVowelChar(String name) {
		String output = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			//if(index==name.indexOf(ch)) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			} 
				
			//}
			
		}System.out.println(name + "-> " + output);
		
		
		// return output;
	} 

	public static void main(String[] args) {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Interview3Que4 interview3Que4 = new Interview3Que4();
		for (int index = 0; index < arr.length; index++) {
			interview3Que4.getVowelChar(arr[index]);
			// String output1=
			// System.out.println(name + "-> " + output1);
		}
	}
}
