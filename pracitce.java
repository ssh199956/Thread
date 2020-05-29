package Unit12;

public class pracitce {
	public static void main(String[] args) {
		Demo11 d=new Demo11("one");
		Demo11 d1=new Demo11("two");
		Thread t1=new Thread(d);
		Thread t2=new Thread(d1);
		t1.start();
		t2.start();
	}
}
class Demo11 extends Thread{
	private String sname="";
	Demo11(String s){
		sname=s;
	}
	public void run(){
		for(int j=0;j<2;j++){
			
	
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName()+" :"+i);
				while(i==10){
					yield();
				}
			} catch (InterruptedException e) {
				
			}		
		}
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName()+"  :"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		}
	}
	
}