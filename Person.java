package lianxi;

public class Person {

	private String name;
	private int age;
	public Person(){
		System.out.println("我是父类的构造方法");
	}
	public Person(String name,int age) {
		System.out.println("父类");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void run() {
		System.out.println("跑步");
	}
}
