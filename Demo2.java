package Unit12;

public class Demo2 {
	public static void main(String[] args) {
		ThreadDeadLock t1=new ThreadDeadLock();
		ThreadDeadLock t2=new ThreadDeadLock();
		t1.a=1;
		t2.a=0;
		Thread t11=new Thread(t1);
		Thread t22=new Thread(t2);
		t11.start();
		t22.start();
	}
}
