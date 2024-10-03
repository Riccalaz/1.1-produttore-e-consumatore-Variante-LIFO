package unpunc11;

import java.util.Random;

public class produttore extends Thread{
	buffer b;
	
	public produttore(buffer buf) {
		b=buf;
	}
	
	public void run() {
		Random ran = new Random();
		
		while(true) {
			
			try {
				b.ins(ran.nextInt(1023));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(ran.nextInt(1000)+100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
