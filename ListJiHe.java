package lianxi;

import java.util.*;

public class ListJiHe {
	public static void main(String[] args) {
		// list集合的特点: 添加数据的顺序和取出数据的顺序一致，并且数据是可以重复的
		// Arraylist集合
		ArrayList<String> list = new ArrayList<String>();
		list.add("李");
		list.add("剑");
		list.add("好");
		list.add("帅");
		System.out.println(list);
		System.out.println(list.get(2));// 获取下标为2的元素值  好
		// 普通for循环遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===========分割线===========");
		// 增强for循环遍历
		for (String it : list) {                                                                           
			System.out.println(it);
		}
		// LinkedList集合，可以使用push()方法来倒序输出
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		//push方法是栈中的方法，栈的特点是先进后出
		list1.push(666);
		list1.push(888);
		list1.push(1);
		list1.push(5);
		list1.add(999);
		// pop方法可以弹出堆栈中第一个元素
		System.out.println("弹出的第一个元素是"+list1.pop());// 999
		// getFirst方法可以返回列表第一个元素
		System.out.println(list1.getFirst());// 5
		// contains方法可以查找list2中是否包含这个括号里的元素
		System.out.println(list1.contains(888)); // true
		// oofferlast方法可以用来在集合最后添加元素
		list1.offerLast(123);
		System.out.println("最终的元素是"+list1);//  1 888 666 123
		// linkedlist集合可以使用普通for循环来遍历集合
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));// 1 888 666 123
		}
		System.out.println("/////////////////////");
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		// addall方法可以把list2中元素全部添加到list集合中
		list.addAll(list2);
		System.out.println(list);// 李剑好帅abcd
		// indexof可以获取元素在集合中的下标值，返回一个整数
		System.out.println(list.indexOf("d"));// 7
		// size方法可以获取list集合的长度
		int changdu = list.size();
		System.out.println(changdu);// 8
		// set方法可以替换集合中元素的下标值的元素
		list.set(1, "我");// 把下标为4的元素替换成后面的元素
		System.out.println(list);// 李我好帅abdc
		for (String str : list2) {
			System.out.println("遍历后的元素是"+str);
		}
		// 利用迭代器遍历list集合
		System.out.println("===========迭代器===========");
		Iterator<Integer> it = list1.iterator();
		while(it.hasNext()) {
			Integer integer = it.next();
			System.out.println(integer);
		}
	}
}
