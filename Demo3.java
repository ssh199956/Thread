package Unit12;

public class Demo3 extends Thread{
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		d.run();

		}
	public void start(){
		for(int i=0;i<3;i++){
			try {
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
