package main;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		for (int i = 1; i <=20; i++) {
			System.out.println(dameCaracter());
		}
		
	}

	static char dameCaracter() {
		Random rnd = new Random();
		
		//obtener cod ascii entre 65 y 90 (mayusculas)
		int codAscii = rnd.nextInt(26)+65;
		//0->mayus 1->minus
		int tipo = rnd.nextInt(2);
		if (tipo==0) {
			//mays
			return (char) codAscii;	
		}else {
			//minus
			return (char) (codAscii+32);
		}
		
		
	}
}
