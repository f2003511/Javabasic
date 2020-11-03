package lianxi;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDomo {
	public static void main(String[] args) {
		String c = "a"+"b";//字符串C所占的空间是3个
		String str = "wbbcmweqea";
		//indexof方法是用来查找字符第一次出现在字符串中的下标位置，返回一个数字
		int a = str.indexOf("m");
		System.out.println(a);
		int b = str.indexOf("w", 5);
		System.out.println(b);//5
		// 从下标处开始截取字符串，包括开始下标的字符
		String d = str.substring(3);
		System.out.println(d);// cmweqea
		String e = str.substring(2, 6);
		// 从开始下标出截取元素，直到结束下标出为止，但不包括结束下标
		System.out.println(e);// bcmw
		// 分割字符串 string.split()
		String str1 = "rgs,1906A,同学们";
		// 这个方法可以分割字符串，从哪里分割是方法的参数，下面的是从逗号分割，分割后的字符串是数组字符串，遍历后得到字符串
		String[] arr = str1.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 拼接字符串
		StringBuffer sb = new StringBuffer();
		// 使用stringbuffer类可以用来拼接字符串，创建对象后使用append(string)的方法可以拼接字符串
		sb.append("我是").append("中国人").append("。");
		System.out.println(sb.toString());
		// 使用stringbuilder类也可以用来拼接字符串，创建对象后使用append(string)的方法可以拼接字符串
		StringBuilder sb1 = new StringBuilder();
		sb1.append("软工").append("1906").append("。");
		System.out.println(sb1.toString());
		// 数学类: math
		// 求绝对值
		int p = -10;
		// Math.abs()这个方法是用来求绝对值的
		System.out.println(Math.abs(p));// 10
		// 求0~10的随机数，Math.random这个方法可以用来求0~1的随机数
		int p1 = (int) (Math.random()*10);
		System.out.println(p1);
		// Date类，日期函数
		// 这个方法可以调用系统时间
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat formit = new SimpleDateFormat("yyyy-MM-dd");
		String strdate = formit.format(date);
		System.out.println(strdate);
		// 将字符日期转化为date类型
		String str11 = "2020-09-30";
		Date parse;
		try {
			parse = formit.parse(str11);
			System.out.print("bb"+parse+"aa");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
}
