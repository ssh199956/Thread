package Unit12;

public class ThreadB implements Runnable{
	int time=0;
	public ThreadB(int time){
		this.time=time;
	}
	@Override
	public void run() {
		System.out.println("�������1-10");
		for(int i=time;i>=0;i--){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("����"+i);
		
		}
		System.out.println("���������������������");
	}
	
}
