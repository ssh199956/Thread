package Unit12;

class Thread1 extends Thread{
	public void run(){
		for(int i=0;i<=3;i++){
			System.out.println("线程"+Thread.currentThread().getName()+"正在运行，输出="+i);
		}
	}
}
