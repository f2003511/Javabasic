package lianxi;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharIOliu {
	public static void main(String[] args) {
		inout.fos();
		inout.fis();
		inout.fos1();
	}
}
class inout{
	// 字符输入流
	public static void fos() {
		File file = new File("D:"+File.separator+"test"+File.separator+"aa.txt");
		try {
			FileReader fr = new FileReader(file);// 访问文件
			// 创建字符缓冲区
			char[] chars = new char[1024];
			int len;// 定义一个数字来表示文件的字符长度
			// 定义变量，如果文件的长度不等于-1，则一行一行进行读取，直到长度为-1
			while ((len = fr.read(chars))!=-1){
				String str= new String(chars,0,len);// 将字符数组对象从下标0开始读到len，全部读完后转化为字符串对象
				System.out.println(str);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 字符输出流
	public static void fis() {
		File file = new File("D:"+File.separator+"test"+File.separator+"bb.txt");
		try {
			FileWriter fr1 = new FileWriter(file);
			String zifu = "快要过年了啊，boom!!!!";
			// write方法可以将字符串写入到文件中
			fr1.write(zifu);
			fr1.close();// 关闭输出流
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 用字符输入输出流实现文件的拷贝
	public static void fos1() {
		File file = new File("D:"+File.separator+"test"+File.separator+"aa.txt");
		try {
			FileReader fr = new FileReader(file);
			char[] chars = new char[1024];
			int len;
			while ((len = fr.read(chars))!=-1) {
				File file2 = new File("D:"+File.separator+"test"+File.separator+"bb.txt");
				FileWriter fr1 = new FileWriter(file2);
				fr1.write(chars,0,len);
				fr1.flush();
				fr1.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}