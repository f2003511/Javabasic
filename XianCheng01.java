package lianxi;
/*
 *  	 线程创建第二种方法：实现Runnable接口创建线程
 *  	 创建Runnable实现类实例对象，创建Thread类型对象，将Runnable实例对象传入到Thread对象的构造器中。
 *  	 开启线程，必须调用线程对象的start方法，启动线程，执行run方法代码。
 */
public class XianCheng01 implements Runnable{

	@Override
	public void run() {
		System.out.println("线程运行时"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		XianCheng01 s1 = new XianCheng01();// 创建runnable实现类实例对象
		Thread p1 = new Thread(s1,"t1线程");// 创建thread实例对象
		Thread p2 = new Thread(s1,"t2线程");
		Thread p3 = new Thread(s1,"t3线程");
		p1.setPriority(10);
		p2.setPriority(1);
		p3.setPriority(5);
		p1.start();// 调用线程对象的start方法来启动线程
		p2.start();
		p3.start();
	}
}
