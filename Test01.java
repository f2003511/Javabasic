package lianxi;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("hello world");
		int a = 12;
		String b = "abcder";
		int c = b.length();
		String b1 = "adcerdd";
		boolean tonglei = b.equals(b1);
		System.out.println(c);
		System.out.println(tonglei);
		Human lijian = new Human();
		lijian.shengao = 180;
//		lijian.eat();
		Human a1 = new Human();
		a1.sleep(12);
		System.out.println(a1.time);
		Human sum1 = new Human();
		int abc = sum1.sum(10, 20);
		System.out.println(abc);
	}
}
class Human{
	int shengao;
	int age;
	String name;
	int time;
	Scanner input = new Scanner(System.in);
	public void eat(){
		System.out.println("请输入一个时间:");
		time = input.nextInt();
		for (;;) {
			if(time<12){
				System.out.println("早餐吃豆腐脑和油条");
				break;
			}else if(time==12) {
				System.out.println("午餐吃蛋炒饭");
				break;
			}else if(time>12&&time<24){
				System.out.println("晚餐吃煎饼果子");
				break;
			}else if(time>24){
				System.out.println("输入错误,请重新输入");
				time = input.nextInt();
			}
		}
	}
	public void sleep(int time) {
//		System.out.println("请输入一个数字");
		this.time = time;
		for (;;) {
			if(time<12){
				System.out.println("早餐吃豆腐脑和油条");
				break;
			}else if(time==12) {
				System.out.println("午餐吃蛋炒饭");
				break;
			}else if(time>12&&time<24){
				System.out.println("晚餐吃煎饼果子");
				break;
			}else if(time>24){
				System.out.println("输入错误,请重新输入");
				time = input.nextInt();
			}
		}
	}
	public int sum(int val1,int val2) {
		return val1+val2;
	}
}
