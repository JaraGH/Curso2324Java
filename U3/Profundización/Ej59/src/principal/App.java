package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	
		int numero=17;
		
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
			System.out.printf("%d es primo", numero);
		else
			System.out.printf("%d no es primo", numero);
//		
		
//		boolean esPrimo = true;
//		for (int divisor = 2; divisor <=(numero/2) && esPrimo==true; divisor++) {
//			if (numero % divisor==0) {
//				esPrimo=false;
//			}
//		}
//		if (esPrimo==true)
//			System.out.printf("%d es primo", numero);
//		else
//			System.out.printf("%d no es primo", numero);
		
		
	}

}
