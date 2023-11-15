package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		int numero=12901; 
		//Segunda forma: enteros
		System.out.println("************************Con enteros************************************");
		
		int divisor=1;
		while (divisor*10<numero)
			divisor*=10;
		
		System.out.println(divisor);
//		
//		
//	
		int n=numero;
		
		System.out.println("Número: " + numero);
		do {
			int digito = n/divisor;
			int resto = n%divisor;
			System.out.println(digito);
			divisor/=10;			
			n=resto;
		}while (n>0);
		
		//Segunda forma: cadenas
//		System.out.println("************************Con String************************************");
//		int numero=12901;   // -->"12901"
//		String numString = Integer.toString(numero);    
//		System.out.println("Número: " + numero);
//		for (int i = 0; i < numString.length(); i++) {
//			System.out.println(numString.charAt(i));
//		}
		

	}

}
