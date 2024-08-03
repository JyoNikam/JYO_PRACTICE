package Interview2;

public class CounterOnProgram {
	 void getFreqOfChar(String name){
	        String out1= name;     //original String
	       name=name.toLowerCase();   //lowercase String
	        for(int index=0;index<name.length();index++){
	            char ch=name.charAt(index);
	            char ch1=out1.charAt(index);
	            int count=0;
	    for(int innerIndex=0; innerIndex<name.length();innerIndex++){
	             if(ch==name.charAt(innerIndex)){
	                 count++;
	             }
	         } //if(index==name.indexOf(ch)){
	         System.out.println(ch1 + "->" + count);   //printing here original String so in ori we are having t and T as well.
	         //}
	        }
	    }
	    
	    public static void main(String[] args){
	    	CounterOnProgram counterOnProgram = new CounterOnProgram();
	    	counterOnProgram.getFreqOfChar("TecHnocREdits");
	    }
}
