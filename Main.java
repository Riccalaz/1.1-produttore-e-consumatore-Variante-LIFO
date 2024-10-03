package unpunc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    
        Scanner myObj = new Scanner(System.in);

        // Creo un buffer per produttore e consumatore
        buffer bu = new buffer();  

        // Creo il thread per il produttore
        produttore p = new produttore(bu);

        // Creo il thread per il consumatore
        consumatore c = new consumatore(bu);

        p.start();
	c.start();
    }
}
