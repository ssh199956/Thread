package Unit12;

public class TestSynDemo {
	public static void main(String[] args) {
		SaleWindow t=new SaleWindow();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
