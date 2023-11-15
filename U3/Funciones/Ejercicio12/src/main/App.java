package main;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		cuentaVocales("Hola y Adiós");
		
	}

	static int cuentaVocales (String cadena) {
		
		String vocalesValidas = "AEIOUaeiouáéíóúÁÉÍÓÚ";
		
		
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);	
			
			int retorno = vocalesValidas.indexOf(caracter);
			
			// -1 no encontro el caracter en la cadena
			System.out.println(retorno);
		}
		return 0;
		
		
		
	}
}
