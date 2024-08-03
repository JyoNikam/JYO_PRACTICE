package Interview3;

public class Interview3Que2 {
	void getNameAndLastLetterUpperCase(String name) {
		String output = "";
		for(int index=0;index<name.length();index++) {
			//char ch=name.charAt(index);
			 output= String.valueOf(Character.toUpperCase(name.charAt(name.length()-1)));
		}
		System.out.println(name + "-> " + output);
	}
	
	public static void main(String[] args) {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Interview3Que2 interview3Que2= new Interview3Que2();
		for(int index=0;index<arr.length;index++) {
		interview3Que2.getNameAndLastLetterUpperCase(arr[index]);
		}
	}
}
