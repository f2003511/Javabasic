package lianxi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class GaoXiaoLiu {
	public static void main(String[] args) {
		try {
			// 字节输入缓冲流
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\test\\aa.txt"));
			int len = bis.available();
			byte[] bytes = new byte[len];
			bis.read(bytes);
			// 字节输出缓冲流
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\test1\\test\\bb.txt"));
			bos.write(bytes);
			bis.close();
			bos.close();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		HuanChongLiu.huanchong();
	}
}
// 字符缓冲流实现文件的拷贝
class HuanChongLiu{
	public static void huanchong() {
		//通过缓冲字符流实现文件拷贝
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		try {
			bufr = new BufferedReader(new FileReader("D:\\test\\aa.txt"));// 字符输入缓冲流 读
			bufw = new BufferedWriter(new FileWriter("D:\\test1\\test\\bb.txt"));// 字符输出缓冲流 写
			String line = null;// 默认的行数
			while((line = bufr.readLine())!= null) {
				bufw.write(line);// 写一行，但没有换行
				bufw.newLine();// 新的一行，就是换行
				bufw.flush();// 清空缓冲区
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}