package lianxi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapJiHe {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		// map集合添加数据通过map.put(key,value)方法
		map.put(11, "小白");
		map.put(22, "18");
		map.put(33, "男");
		map.put(44, "1906");
		// 取数据，通过使用get(key)值的方法取值
		String name1 = map.get(22);
		System.out.println(name1);// 18
		// containskey方法可以判断集合中是否包括这个key值，返回结果是布尔值
		System.out.println(map.containsKey(55));// false
		// replace方法可以替换key中的value值
		map.replace(11, "小黑");// 22 20
		// size方法可以返回map集合中key值的数量
		int size = map.size();
		System.out.println(size);// 4
		// keyset方法返回map集合中所有key值的set集合
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		// 遍历keyset循环打印出所有value值
		for (Integer integer : keySet) {
			String string = map.get(integer);
			System.out.println(string);
		}
		// 通过map.keyset方法获取到key值的集合，通过迭代器遍历到每个key值，通过map.get(key)方法得到所有value值集合
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()){
			Integer key = it.next();
			String value = map.get(key);
			System.out.println("key:"+key+","+"value:"+value);
		}
		// 第二种方法通过map.entryset方法获取到键值对集合，利用增强for循环遍历出所有元素集合
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> m : entrySet) {
			System.out.println("key值"+m.getKey()+"value值"+m.getValue());
		}
		// 第三种方法通过map.entryset方法获取到键值对集合，利用迭代器遍历出所有元素集合
		Iterator<Entry<Integer, String>> m1 = entrySet.iterator();
		while(m1.hasNext()) {
			Entry<Integer, String> next = m1.next();
			String value = next.getValue();
			System.out.println("key值："+next+"value值："+value);
		}
		// 有字符串，如何统计出每个字符出现的次数
		System.out.println("======================");
		String a = "pouhjpunmyqqwqwdcsdfsd";
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		char[] b = a.toCharArray();
		Integer count = null;
		for (char c : b) {
			count = map1.get(c);
			if(map1.containsKey(c)) {
				map1.put(c, count+1);
			}else {
				map1.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet2 = map1.entrySet();
		for (Entry<Character,Integer> entry:entrySet2) {
			System.out.println(entry.getKey()+"出现次数"+entry.getValue());
		}
	}
}