package unpunc11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		buffer bu=new buffer();
		
		produttore p=new produttore(bu);
		consumatore c=new consumatore(bu);
		p.start();
		c.start();
		
		
	}

}
