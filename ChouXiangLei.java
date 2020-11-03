package lianxi;

public abstract class ChouXiangLei {
	private String name;
	private String address;
	private int number;
	//这是抽象方法，不用带括号，没有方法体
	public abstract String pop();
	public abstract void pop1();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	// 抽象类的有参构造器
	public ChouXiangLei(String name,String address,int number) {
		System.out.println("抽象类的有参构造方法");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public double compay() {
		System.out.println("类的普通方法");
		return 1.0;
	}
	public void mailclick() {
		System.out.println("类的普通方法"+this.name+" "+this.address);
	}
	@Override
	public String toString() {
		return "ChouXiangLei [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
}
class son1 extends ChouXiangLei{
	public son1(String name, String address, int number) {
		super(name, address, number);
	}
	// 子类继承抽象类，就必须重写抽象类中的所有抽象方法
//	public String pop() {
//		System.out.println("重写这个抽象方法"+getName());
//		return "11";
//	}
	@Override
	public String pop() {
		System.out.println("重写这个抽象方法"+getName());
		return "11";
	}
	@Override
	public void pop1() {
		System.out.println("重写抽象方法"+getAddress());
	}
}
