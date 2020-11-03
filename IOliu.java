package lianxi;

import java.io.File;
import java.io.IOException;

public class IOliu {
	public static void main(String[] args) {
		// 创建目录，指定创建文件夹的路径和文件夹名称
		String pathname = "D:\\test";
		File file = new File(pathname);
		// makdir方法可以创建文件夹
		file.mkdir();
		// 创建多级目录，指定创建文件夹的路径和文件夹名称
		String pathname1 = "D:\\test1\\test\\test1";
		File file2 = new File(pathname1);
		file2.mkdirs();// 多个目录，方法名后面必须加s
		// 创建文件
		String wenjian = "D:\\test\\aa.txt";
		File wenjian1 = new File(wenjian);
		try {
			wenjian1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String pathname2 = "D:\\test1\\test\\bb.txt";
		File file6 = new File(pathname2);
		try {
			file6.createNewFile();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		String pathname3 = "D:\\test\\bb.txt";
		File file10 = new File(pathname3);
		try {
			file10.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File file9 = new File(pathname3);
		String path2 = file9.getAbsolutePath();
		System.out.println(path2);
		System.out.println("=================");
		// 删除文件夹,只能删除最外面的一层，一层一层删除
		File file3 = new File(pathname1);
		if(file3.isDirectory()) {// 删除之前先要判断最外层是否是目录，使用isdirectory方法
			// 如果是目录，使用delete方法来删除目录
			file3.delete();
		}
		// 判断文件是否可读，使用canread方法,返回boolean值
		boolean iswenjian = wenjian1.canRead();
		System.out.println(iswenjian);// true
		// 获取路径: 相对路径和绝对路径
		String juedui = wenjian1.getAbsolutePath();// 这个方法是获取绝对路径的
		System.out.println(juedui);// 返回一个字符串路径
		String path = wenjian1.getPath();// 这个方法是获取相对路径
		System.out.println(path);
		// 获取文件名或者是文件夹名
		// file.getName方法可以获取文件名或者文件夹名
		File file4 = new File(pathname);
		String name = file4.getName();
		System.out.println(name);// 文件名 test
		File file5 = new File(wenjian);
		String name2 = file5.getName();
		System.out.println(name2);// 文件名称  aa.txt
		String pathname12 = "D:\\test1\\test111";
		File file8 = new File(pathname12);
		file8.mkdir();// 创建文件夹
		// 获取当前目录下的所有子目录和所有子文件
		String allpath = "D:\\test1";
		// file7.list方法可以一个目录下的所有子目录和子文件，得到的结果是一个string数组，遍历后得到所有元素
		File file7 = new File(allpath);
		String[] list = file7.list();
		for (String str : list) {
			System.out.println(str);
		}
		
	}
}
