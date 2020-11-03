package lianxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("f");
		list.add("b");
		list.add("c");
		list.add("e");
		System.out.println(list);// a f b c e
		// sort方法可以从小到大排序
		Collections.sort(list);
		System.out.println(list);// a b c e f
		// shuffle方法可以对集合随机排序
//		Collections.shuffle(list);
//		System.out.println(list); 随机排序
		// reverse方法可以将集合元素反转
		Collections.reverse(list);
		System.out.println(list);// f e c b a
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(50);
		list1.add(45);
		list1.add(8);
		list1.add(32);
		// collections.max方法可以得到集合中的最大值
		Integer max = Collections.max(list1);
		System.out.println("最大值是: "+max);// 50
		// collections.min方法可以得到集合中的最小值
		Integer min = Collections.min(list1);
		System.out.println("最小值是: "+min);// 8
		// collections.addall方法可以将元素添加到指定的集合中
		Collections.addAll(list, "p","o","u");
		System.out.println(list);// f e c b a p o u
		Collections.addAll(list, "");
		System.out.println(list);// collections.allAll方法也可以添加空字符，不报错
		Collections.sort(list1);
		System.out.println(list1);// 8 12 32 45 50
		// collections.binarysearch方法可以查找集合中的元素，返回下标值,用方法前必须先对集合排序
		int i = Collections.binarySearch(list1, 12);
		System.out.println(i);//1
		// 自定义排序
		System.out.println("===============");
		Collections.sort(list1, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) {
					return 1;
				}
				if(o1<o1) {
					return -1;
				}
				return 0;
			}
		});
		System.out.println(list1);
		// Arrays.asList(new Integer[list1.size()])方法规定了要copy集合的长度，固定格式
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[list1.size()]));
		Collections.copy(list2, list1);
		System.out.println(list2);
		// collections.ncopies方法可以返回一个指定元素内容和数量的集合
		List<String> list3 = Collections.nCopies(6, "中国");
		System.out.println(list3);// [中国, 中国, 中国, 中国, 中国, 中国]
		ArrayList<String> list4 = new ArrayList<>();
		list4.add("b");
		// 返回一个集合中的元素在另一个集合中第一次出现的位置
		// list:[f, e, c, b, a, p, o, u, ] list4: b ,集合list4中的元素b第一次出现在集合list中的位置的下标值
		int i1 = Collections.indexOfSubList(list, list4);
		System.out.println(i1);// 3
	}
}
