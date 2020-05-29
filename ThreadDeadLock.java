package Unit12;

public class ThreadDeadLock implements Runnable{
	public int a=1;
	static Object o1=new Object(),o2=new Object();
	
	@Override
	public void run() {
		if(a==1){
			synchronized (o1) {
				try {
					Thread.sleep(10);
					System.out.println("this is o1 , need o2");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("get o2");
				}
			}
		}
		if(a==0){
			synchronized (o2) {
				try {
					Thread.sleep(10);
					System.out.println("this is o2,need o1");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("get o1");
				}
			}
		}
		
	}
}
