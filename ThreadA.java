package Unit12;

public class ThreadA extends Thread{
	int time=0;
	public ThreadA(int time){
		this.time=time;
	}
	public void run(){
		
			System.out.println("�������֣�1-10");
			for(int i=time;i>=0;i--){
				try {
					Thread.sleep(1000);
					System.out.println("����"+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
		}
			System.out.println("������ֽ�������������");
	}
}
