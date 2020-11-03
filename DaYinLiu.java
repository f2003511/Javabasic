package lianxi;

import java.io.PrintStream;
import java.io.PrintWriter;

public class DaYinLiu {
	public static void main(String[] args) {
		try {
			// 创建字节打印流，用printstream方法
			PrintStream ps = new PrintStream("D:\\test\\aa.txt");
			ps.println("hahaha");// 打印字符串
			ps.println(123456);// 打印数字
			ps.println(false);// 打印布尔值
			ps.println('b');// 打印字符
			ps.flush();// 清空缓冲区
			ps.close();// 关闭字节流
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 创建字符打印流，用printwrite方法
		try {
			PrintWriter pw= new PrintWriter("D:\\test\\bb.txt");
			pw.write("ABCD");
			pw.write("\n");
			pw.write("efdada");
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
