package JyotiPractice;

public class Manager {
	int id;
	String name;
	int deptId;
	
	void setData(){
		id = 1;
		name = "techno";
		deptId = 123;
	}
	
	void displayData(){
		System.out.println(id + "-" + name + "-" + deptId);
	}
}
