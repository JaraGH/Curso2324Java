package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	
		String cadena = "holA23ñññ";
		
		int contadorMayus=0;
		int contadorMinus=0;
		int contadorDigitos=0;
		
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i); 
			
			if ((caracter>='A' && caracter<='Z') || caracter=='Ñ' )
				contadorMayus++;
			else if ((caracter>='a' && caracter<='z') || caracter=='ñ')
				contadorMinus++;
			else if (caracter>='0' && caracter<='9')
				contadorDigitos++;
		}
		System.out.println(cadena);
		System.out.printf("Mayúsculas: %d\n", contadorMayus);
		System.out.printf("Minúsculas: %d\n", contadorMinus);
		System.out.printf("Dígitos: %d\n", contadorDigitos);
		
		

	}

}
