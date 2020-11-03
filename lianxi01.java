package lianxi;
import java.util.*;
public class lianxi01 {
	public static void main(String[] args) {
		int a = 1;
		byte b = 1;
		short c = 3;
		long d = 12l;
		float zifu = 1f;
		double zifuchuan = 2.5;
		boolean isnumber = true;
		char op = 'n';
		String bb = "name";
		System.out.println(isnumber);
		String arr[] = new String[2];
		String arr1[] = {"1","2","3"};
		final int AA = 12;
		System.out.println(AA);
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入一个字符串（中间有空格）");
//		String zifuchuan1 = input.nextLine();
//		System.out.println("请输入一个字符串（中间没空格）");
//		String zifuchuan2 = input.next();
//		System.out.println("请输入一个数字");
//		int zhengshu = input.nextInt();
//		System.out.println(zifuchuan1+zifuchuan2);
//		System.out.println(zhengshu);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		int isdayu = a>5?a++:a--;
		System.out.println("最终数字是"+isdayu);
		if(a<4) {
			a++;
			System.out.println(a);
		}
		int[] arrays = new int[3];
		int changdu = arrays.length;
//		FengZhuang student = new FengZhuang();
//		student.setName("lijian");
//		student.getName();
//		student.setSex("男");
//		student.getSex();
//		student.setAge(29);
//		student.getAge();
		FengZhuang.a = 1;
		FengZhuang2 student1 = new FengZhuang2();
		student1.setName1("tom");
		student1.getName1();
		student1.setSex1("女");
		student1.getSex1();
		student1.setAge1(30);
		student1.getAge1();
		FengZhuang3 student2 = new FengZhuang3("李剑","男",25);
		student2.setName2("Daval");
		student2.getName2();
		student2.setSex2("男");
		student2.getSex2();
		student2.setAge2(31);
		student2.getAge2();
	}
}
