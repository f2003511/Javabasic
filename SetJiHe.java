package lianxi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetJiHe {
	public static void main(String[] args) {
		// set集合特点: 数据输出的顺序和存入顺序无关，数据不可重复
		// set集合分为hashset和treeset两类
		HashSet<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		// set集合遍历，使用增强for循环
		for (String s1 : set) {
			System.out.println(s1);// a b c d 
		}
		System.out.println("==============");
		// 使用迭代器遍历集合
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1);
		}
		System.out.println("===============");
		// 有一个重复元素的list集合，如何将元素去重
		// 可以使用hashset集合没有重复的特点，来去重
		ArrayList<String> s2 = new ArrayList<>();
		s2.add("a");
		s2.add("a");
		s2.add("b");
		s2.add("c");
		HashSet<String> s3 =new HashSet<>(s2);
		for (String string : s3) {
			System.out.println(string);
		}
	}
}
