package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	
		for (int numero = 2; numero <=10000; numero++) {
			
			int divisor=2;
			boolean esPrimo = true;
			while (divisor<=(numero/2)) {
				
				if (numero % divisor==0) {
					esPrimo=false;
					break;
				}
				divisor++;			
			}
			
			if (esPrimo)
				System.out.printf("\n%d es primo", numero);
		}
		
	}

}
