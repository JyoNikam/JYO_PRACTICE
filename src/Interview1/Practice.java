package Interview1;

public class Practice extends A {

	public Practice() {
		super();
		System.out.println(1);
	}
	
	public void m1() {
		System.out.println("Child m1");
	}
	
	public static void main(String[] args) {
		Practice practice=new Practice();
		System.out.println("end");
	}
}
