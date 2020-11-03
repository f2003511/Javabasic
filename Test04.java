package lianxi;



public class Test04 {
	public static void main(String[] args) {
		father m1 = new father(20);
		System.out.println(m1.age);
		children m2 = new children(15);
		m2.eat();
	}
}
class father{
	int age;
	String sex;
	public father(int age){
		this.age = age;
	}
	public void eat(){
		System.out.println("你是父亲");
	}
	public void sleep(){
		System.out.println("你要睡觉");
	}
}
class children extends father{

	public children(int age) {
		super(age);
	}
	@Override
	public void eat() {
		System.out.println(age);
	}
	
}

