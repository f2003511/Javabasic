package lianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InPutOutPut {
	public static void main(String[] args) {
		shuruliu.input();
		shuruliu.output();
		shuruliu.copy();
	}
}
class shuruliu{
	// 字节输入流
	public static void input() {
		File file = new File("D:"+File.separator+"test"+File.separator+"aa.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			int size = fis.available();// size为字符串的长度，一次性读完
			byte[] b = new byte[size];// 创建一个字节数组，长度为要读取的字符串长度
			fis.read(b);
			fis.close();// 关闭输入流
			String str = new String(b,"GBK");// 字符串解码
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 字节输出流
	public static void output() {
		File file1 = new File("D:"+File.separator+"test"+File.separator+"bb.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file1);
			String str = "iqwriqwporiq";
			byte[] bytes = str.getBytes();
			fos.write(bytes);
			fos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	// 用字节输入输出流实现文件的拷贝
	public static void copy() {
		File fis = new File("D:"+File.separator+"test"+File.separator+"aa.txt");
		try {
			FileInputStream fis1 = new FileInputStream(fis);
			int len = fis1.available();
			// 创建一个byte数组用来接收方法读取到的数据长度放入数组中
			byte[] s1 = new byte[len];
			fis1.read(s1);// 读取数据
			File fis2 = new File("D:"+File.separator+"test1"+File.separator+"test"+File.separator+"bb.txt");
			FileOutputStream fos = new FileOutputStream(fis2);
			fos.write(s1);// 将读取的数据写入指定的路径
			fos.flush();// 冲刷缓冲区
			fis1.close();
			fos.close();
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
}