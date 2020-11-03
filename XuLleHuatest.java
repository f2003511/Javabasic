package lianxi;

public class XuLleHuatest {
	public static void main(String[] args) {
		XuLianHua.doxhlianhua();
		XuLianHua.doxhlianhuatest();
	}

	@Override
	public String toString() {
		return "XuLleHuatest [name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address + "]";
	}

	private String name;
	private int age;
	private String sex;
	private String address;
	public XuLleHuatest(String name,int age,String sex,String address) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}	
