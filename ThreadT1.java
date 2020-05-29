package Unit12;

public class ThreadT1 extends Thread{
	ThreadT2 t2=new ThreadT2();
	public void run(){
		System.out.println("thread1 thread is running...");
		t2.setName("Thread2");
		t2.start();
		System.out.println(Thread.currentThread().getName()+"正在运行。。");
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"正在运行。。。");
		
	}
}
