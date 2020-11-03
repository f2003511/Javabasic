package lianxi;

import java.util.Scanner;

public class Zuoye {
	public static void main(String[] args) {
		int ji = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个路线");
		String luxian = input.next().toUpperCase();
		for(;;) {
			if(luxian.equals("A")) {
			ji = ji + 5;
			break;
			}else if(luxian.equals("B")) {
			ji = ji + 10;
			break;
			}else {
			System.out.println("输入错误，请重新输入");
			luxian = input.next();
		}
		}
		System.out.println(ji);
		// 2题
		System.out.println("请输入睡觉的次数");
		int end = input.nextInt();
		int sum = 0;
		for(int i = 0;i<=end;i++) {
			sum = sum + i;
		}
		System.out.println("总共打的嘴巴是"+sum);
		// 5题
		int sum1 = 0;
		for(int i = 2;i<=100;i++) {
			int x = 0;
			for(int j = 2;j < i;j++) {
				if(i%j==0) {
					x++;
				}
			}
			if(x==0) {
				sum1+=i;
				System.out.println("这些质数是"+i);
			}
		}
		System.out.println("所有质数的和是"+sum1);
		// 4题
		int sum2 = 0;
		int[] yiban = {2,3,4,1,4,3,5,2,3,7,10};
		for(int i = 0;i<yiban.length;i++) {
			sum2+=yiban[i];
		}
//		int[] erban = {1,4,3,5};
//		int[] sanban = {2,3,7};
//		int[] siban = {10};
//		for(int i = 0;i<erban.length;i++) {
//			if(i < yiban.length) {
//				sum2+=yiban[i];
//			}else if(i < sanban.length){
//				sum2+=sanban[i];
//			}else if(i < siban.length) {
//				sum2+=siban[i];
//			}
//			sum2+=erban[i];
//		}
		System.out.println(sum2);
	}
		
}
