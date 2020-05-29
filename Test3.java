package Unit12;

public class Test3 {
	public static void main(String[] args) {
		ThreadB t=new ThreadB(10);
		Thread t1=new Thread(t);
		t1.start();
	}
}
