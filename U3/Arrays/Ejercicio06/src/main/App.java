package main;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nº de elementos el array: ");
		int numeroElementos = entrada.nextInt();
		
		if (numeroElementos>=0) {
			int [] a = dameArrayLleno(numeroElementos);
			System.out.println(Arrays.toString(a));
					
		} else {
			System.out.println("No se puede crear el array");
		}
		
		
	}
	
	static int [] dameArrayLleno(int tamanio) {
		
		int [] a = new int[tamanio];
		int semilla=3;
		for (int i = 0; i < a.length; i++) {
			a[i]=semilla;
			semilla+=2;
		}
		return a;
	}

}
