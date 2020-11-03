package lianxi;

import java.io.Serializable;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
/*
 *  	序列化：将内存中对象的数据（二进制数据）输出，
 *  	在网络中传输或者保存到磁盘当中。
 *  	如果需要将对象支持序列化，那么该对象的类必须实现可序列化接口。
 *  	实现序列化的接口有Serializable,Serializable序列化时不会调用默认的构造器
 *  	当实现了Serializable接口后，该类的对象可以被序列化。
 */

public class XuLianHua implements Serializable{
	@Override
	public String toString() {
		return "XuLianHua [name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address + "]";
	}
	private String name;
	private int age;
	private String sex;
	private String address;
	public XuLianHua(String name,int age,String sex,String address) {
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
	public static void doxhlianhua() {
		XuLianHua person = new XuLianHua("tom", 18, "男", "us");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\test\\aa.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(person);
			oos.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void doxhlianhuatest() {
		XuLleHuatest student= new XuLleHuatest("jerry",20,"女","usa");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\test\\bb.txt");
			BufferedOutputStream bufo = new BufferedOutputStream(fos);
			PrintWriter pw = new PrintWriter(bufo);
			pw.print(student);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
