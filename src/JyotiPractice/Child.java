package JyotiPractice;

public class Child extends Parent{
	static int x = 100;
	int y = 200;
	int z = 300;
	
	void display(){
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		Parent p= new Child();
			p.display();
			System.out.println(x);
		
	}
}
