package lianxi;
import java.lang.*;


public class JieKou {
	public static void main(String[] args) {
		Mather M = new Mather();
		M.eat();// 实现吃的方法
		M.sleep();// 实现睡觉的方法
		int a = M.ziji();
		System.out.println(a);// 12
		Mather Y = new son();
		Y.eat();// 儿子吃饭
		M.run();// 实现人类中的跑步方法
		M.learn();// 实现人类中的学习方法
		M.tiqiu("tom");// 在中国想要踢球是很困难的tom
		son s = (son)Y;
		s.play();// 儿子自己玩耍
		
	}
}
// 接口
interface Animal{
	public static final String name = "";
	public void eat();
	public void sleep();
}
//第二个接口
interface Mao{
	public void run();
	public void learn();
}
// 第三个接口继承第一个接口
interface Football extends Animal{
	public void tiqiu(String name);
}
//第四个接口是标记接口
interface Mokey extends Animal{
	
}
// 类实现接口
class Mather implements Animal,Mao{
	public void eat() {
		System.out.println("实现吃的方法");
	}
	public void sleep() {
		System.out.println("实现睡觉的方法");
	}
	public int ziji() {
		return 12;
	}
	public void run() {
		System.out.println("实现人类中的跑步方法");
	}
	public void learn() {
		System.out.println("实现人类中的学习方法");
	}
	public void tiqiu(String name) {
		System.out.println("在中国想要踢球是很困难的"+name);
	}
}
class son extends Mather implements Animal{
	@Override
	public void eat() {
		System.out.println("儿子吃饭");
	}
	public void play() {
		System.out.println("儿子自己玩耍");
	}
	@Override
	public void sleep() {
		System.out.println("");
	}
}