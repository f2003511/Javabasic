package lianxi;
/*
 *   	线程创建的第一种写法:
 *   	继承thread类重写run()方法
 *   	启动线程后，同时运行多个线程，多个线程会抢CPU执行权，谁抢到，谁执行，其他线程挂起。
 */
public class XianCheng extends Thread{
	// 线程启动时，执行线程里面的方法
	@Override
	public void run() {
		// currentthread()方法是当前线程  getname()方法是获取当前线程的名字
		try {
			Thread p1 = Thread.currentThread();// 创建线程的实例对象
			System.out.println("线程运行了"+p1.getName());// 打印出当前线程的名称
			Thread.sleep(200);// 让线程先睡眠200毫秒
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		XianCheng s1 = new XianCheng();// 创建Thread子类实例
		XianCheng s2 = new XianCheng();// 创建Thread子类实例
		XianCheng s3= new XianCheng();// 创建Thread子类实例
		s1.setName("t1线程");// 设置线程的名字
		s2.setName("t2线程");
		s3.setName("t3线程");
		s1.setPriority(10);// 线程优先级设置
		s1.setPriority(2);
		s1.setPriority(5);
		s1.start();// 启动线程
		s2.start();// 启动线程
		s3.start();// 启动线程
		// s1,s2,s3三个线程随机运行
	}
}
