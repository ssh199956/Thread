package Unit12;

class SaleWindow implements Runnable{
	private int tickets=30;
	String str="";
	@Override

	public void run() {
		while(true){
			synchronized (str) {
				
			
			if(tickets>0){
				try {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName()+"is saling "+tickets--);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
		}
	}

}
