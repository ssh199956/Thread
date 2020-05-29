package Unit12;

public class Demo {
	public static void main(String[] args) {
		JoinDemo t=new JoinDemo("新加入的线程：");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"线程");
	}
}
