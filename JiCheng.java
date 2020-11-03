package lianxi;

public class JiCheng {
	public static void main(String[] args) {
		Student student = new Student(20,"aaa");
		System.out.println(student.toString());
		son1 son11 = new son1("lijian", "123", 20);
		son11.compay();
		System.out.println(son11.compay());
		System.out.println(son11.getName());
		son11.pop();
	}
}
