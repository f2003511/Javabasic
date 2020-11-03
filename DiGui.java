package lianxi;
/*
 * 	递归：递归就是在本方法内部，不断调用自身方法，在合适的机会结束
 *  file.listFiles方法是返回某个目录下的所有文件和目录的绝对路径，返回的是一个file数组
 */
import java.io.File;

public class DiGui {
	public static void main(String[] args) {
		String pathName = "D:\\test1";
		DiGui11.getDirs(pathName);
	}
}
class DiGui11{
	public static void getDirs(String pathname) {
		File file = new File(pathname);
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			if(file2.isDirectory()) {
				// 如果下一级还是目录，获取目录的绝度路径地址
				String absolutePath = file2.getAbsolutePath();
				// 打印出这级目录的文件名
				System.out.println("目录："+file2.getName());
				getDirs(absolutePath);
			}else {
				System.out.println("文件"+file2.getName());
			}
		}
	}
}