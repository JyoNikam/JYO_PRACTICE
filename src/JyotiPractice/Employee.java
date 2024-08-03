package JyotiPractice;

public class Employee extends Manager {
	int id;
	String name;
	double salary;
	
	void setData(){
		id = 10;
		name = "credits";
		salary = 123.23;
	}
	
	void printData(){
		System.out.println(id + "-" + name + "-" + salary);
	}
}
