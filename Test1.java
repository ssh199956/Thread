package Unit12;

public class Test1 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("��ǰ�߳��ǣ�"+t);
		t.setName("MyJavaProgram");
		System.out.println("��ǰ�߳��ǣ�"+t);
		for(int i=0;i<5;i++){
			System.out.println(i);
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
