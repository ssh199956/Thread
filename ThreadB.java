package Unit12;

public class ThreadB implements Runnable{
	int time=0;
	public ThreadB(int time){
		this.time=time;
	}
	@Override
	public void run() {
		System.out.println("输出数字1-10");
		for(int i=time;i>=0;i--){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("数字"+i);
		
		}
		System.out.println("数字输出结束。。。。。");
	}
	
}
