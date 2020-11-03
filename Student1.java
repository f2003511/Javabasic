package lianxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student1 {
	public static void main(String[] args) {
		list p1 = new list("tom", 60);
		list p2 = new list("lick", 70);
		list p3 = new list("pop", 80);
		list p4 = new list("yui", 76);
		list p5 = new list("daer", 66);
		list p6 = new list("kyu", 79);
		ArrayList<list> s1 = new ArrayList<>();
		s1.add(p1);
		s1.add(p2);
		s1.add(p3);
		s1.add(p4);
		s1.add(p5);
		s1.add(p6);
		// 给s1集合排序，这个排序也叫自定义排序
		Collections.sort(s1,new Comparator<list>() {

			@Override
			public int compare(list o1, list o2) {
				if(o1.getScore()>o2.getScore()) {
					return 1;
				}
				if(o1.getScore()<o2.getScore()) {
					return -1;
				}
				return 0;
			}	
		});
		for (list list : s1) {
			System.out.println(list.toString());
		}
	}	
}
class list{
	@Override
	public String toString() {
		return "list [name=" + name + ", score=" + score + "]";
	}
	
	public static int size() {
		return 0;
	}
	private String name;
	private int score;
	public list(String name,int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}