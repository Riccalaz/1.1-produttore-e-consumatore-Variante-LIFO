package unpunc;

import java.util.LinkedList;

public class consumatore extends Thread{
	private int pari;
	private int dis;
	buffer b;
	
	public consumatore(buffer bu) {
		pari=0;
		b=bu;
		dis=0;
	}
	
	public void run() {
		int val;
		while(true) {
			try {
				val=b.rim();
				if(val!=-2000) {  //legge il valore del buffer che se è -2000 significa che non è stato letto alcun valore
					if(val%2==0) {
						pari++;
					}else {
						dis++;
					}
					System.out.println("il valore è "+val+" siamo a "+pari+" pari e "+dis+" dispari");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		

}
