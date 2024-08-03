package Interview1;

public class HelloWorldInt1 {
	 void getUniqueVowelFreq(String name){
	        for(int index=0;index<name.length();index++){
	            char ch=name.charAt(index);
	        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
	            String output= "";
	            int count=0;
	        for(int innerIndex=0;innerIndex<name.length();innerIndex++){
	            if(ch==name.charAt(innerIndex)){
	                output=output+ch;
	                count++;
	            }
	        } if(index==name.indexOf(ch)){
	             if(count==1){
	                System.out.print(output);
	                }
	        }
	   	           
	        }
	        } 
	    }
	    public static void main(String[] args){
	      HelloWorldInt1 helloWorldInt1 = new HelloWorldInt1();
	      helloWorldInt1.getUniqueVowelFreq("aakaniksha eaep dube");
	    }

}
