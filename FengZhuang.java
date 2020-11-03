package lianxi;

public class FengZhuang {
	private String name;
	private String sex;
	private int age;
	public static int a;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
class FengZhuang2{
	private String name1;
	private String sex1;
	private int age1;
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName1() {
		return name1;
	}
	public void setSex1(String sex1) {
		this.sex1 = sex1;
	}
	public String getSex1() {
		return sex1;
	}
	public void setAge1(int age1) {
		this.age1 = age1;
	}
	public int getAge1() {
		return age1;
	}
}
class FengZhuang3{
	private String name2;
	private String sex2;
	private int age2;
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName2() {
		return name2;
	}
	public void setSex2(String sex2) {
		this.sex2 = sex2;
	}
	public String getSex2() {
		return sex2;
	}
	public void setAge2(int age2){
		this.age2 = age2;
	}
	public int getAge2() {
		return age2;
	}
	FengZhuang3(String name,String sex,int age){
		name2 = name;
		System.out.println("名字叫"+name+"性别是"+sex+"年龄是"+age);
	}
}
