package Interview3;

public class Interview3Que3 {
	 int getDifferedIndex(int[] arr1, int[] arr2) {
		 int num=0;
		 for(int index=0;index<arr1.length;index++) {
			 
			 if(arr1[index]!=arr2[index]) {
				// System.out.println(arr1[index]);
				 num=index;
				 break;
			 }
		 }
		 return num;
	 }
	 
	 public static void main(String[] args) {
		 int [] arr1={10,20,30,40,50};
		 int [] arr2={10,20,40,60,80};
		 Interview3Que3 interview3Que3 = new Interview3Que3();
		int output= interview3Que3.getDifferedIndex(arr1,arr2);
		System.out.println(output);
	 }
}
