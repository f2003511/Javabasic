package lianxi;
/*
 *  	线程从创建到销毁会经历五个阶段：
 *  	新建：使用new关键字和thread类或其子类建立一个线程对象后，该对象就处于新建状态，直到程序start这个线程
 *  	就绪：当线程对象调用了start方法后，该进程就进入了就绪状态，
 *  	运行：如果就绪状态的线程获取CPU的资源，就可以执行run()方法，此时线程处于运行状态，可以变为就绪，阻塞，死亡
 *  	阻塞：如果一个线程执行了sleep方法，失去所占用的资源后，该线程就从运行变成阻塞了
 *  	死亡：一个运行状态的线程完成run()方法执行完毕后或者其他终止条件发生
 *  	正确终止进程？使用标志位，public volatile boolean flag
 */
public class XianChengZhouQi implements Runnable{
	public volatile boolean flag = true;// 使用标志符
	@Override
	public void run() {
		int i = 0;
		while(flag) {
			i++;
			System.out.println(Thread.currentThread().getName());
			if(i==5) {
				flag = false;// 停止线程的运行
			}
		}
		
	}
	public static void main(String[] args) {
		// 新建状态
		XianChengZhouQi s1 = new XianChengZhouQi();
		Thread p1 = new Thread(s1);
		// 就绪状态
		p1.setName("t1线程");
		p1.start();
		for(int i = 0; i < 10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					p1.join();// 主方法main()会暂时挂起，等待线程执行完毕后再执行main方法
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
