package lianxi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOZhuangHuanLiu {
	public static void main(String[] args) {
		// 转换流
				try {
					// 创建字节输入流
					FileInputStream fis = new FileInputStream("D:\\test\\aa.txt");
					// 将字节输入流转化为字符输入流
					InputStreamReader isr = new InputStreamReader(fis,"GBK");
					// 创建缓冲流
					BufferedReader br = new BufferedReader(isr);
					String line = null;
					while((line = br.readLine())!=null){
						System.out.println(line);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				try {
					// 创建字节输入流
					FileInputStream fis = new FileInputStream("D:\\test\\aa.txt");
					// 把字节输入流转化为字符输入流
					InputStreamReader isr = new InputStreamReader(fis,"GBK");
					// 创建缓冲流
					BufferedReader br = new BufferedReader(isr);
					// 创建字节输出流
					FileOutputStream fos = new FileOutputStream("D:\\test1\\test\\bb.txt");
					// 将字节输出流转化为字符输出流
					OutputStreamWriter isr1= new OutputStreamWriter(fos,"GBK");
					// 创建缓冲流
					BufferedWriter br1 = new BufferedWriter(isr1);
					String line = null;
					while((line = br.readLine()) != null) {
						isr1.write(line);
						isr1.flush();
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
}
