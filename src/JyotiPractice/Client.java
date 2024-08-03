package JyotiPractice;

public class Client {
	public static void main(String[] args){
		Manager mng = new Employee();
		mng.setData();
		
		System.out.println(mng.id);
		System.out.println(mng.name);
		System.out.println(mng.deptId);
	}
}
