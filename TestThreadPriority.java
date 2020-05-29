package Unit12;

public class TestThreadPriority {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.setName("thread1");
		t1.setPriority(Thread.MIN_PRIORITY);
		Thread1 t2=new Thread1();
		t2.setName("thread2");
		t2.setPriority(Thread.NORM_PRIORITY);
		Thread1 t3=new Thread1();
		t3.setName("thread3");
		t3.setPriority(Thread.MAX_PRIORITY);
		t3.start();
		t2.start();
		t1.start();
	
	}
	
}
