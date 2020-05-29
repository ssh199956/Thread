package Unit12;

public class PCM1{
	public static void main(String[] args) {
		PCM p1=new PCM("one");
		p1.run();
		PCM p2=new PCM("two");
		p2.run();
	}
}
class PCM extends Thread{
	private String STname="";
	PCM(String s){
		STname=s;
	}
	public void run(){
		for(int i=0;i<2;i++){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				yield();
				System.out.println(STname);
			}
			
		}
	}
}
