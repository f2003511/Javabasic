package lianxi;

public class Test03 {
	static boolean isname;
	int num;
	public static void main(String[] args) {
		char b = 'a';
		char a = 'c';
		int c = b-a;
		System.out.println(c);
		System.out.println(isname);
		int aa = 1;
		System.out.println(aa++);
		Dog d = new Dog();
//		Dog d = new Dog(1,2);
//		d.setColor("white");
		System.out.println(d.getColor());
		int x = 10;
		Test03 test03 = new Test03();
		test03.addot(x);
		System.out.println(x);
		System.out.println(test03.num);
		Dog.barking();
	}
//	@Test
//	public void m1() {
//		System.out.println("第一行");
//	}
	void addot(int num) {
		this.num = num + 1;
//		num = num +1;
	}
}
class Dog{
	private String color;
	public Dog() {
		color = "red";
	}
	public Dog(int a,int b){
		color = "green";
	}
	public String getColor(){
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static void barking() {
		System.out.println("你好");
	}
}