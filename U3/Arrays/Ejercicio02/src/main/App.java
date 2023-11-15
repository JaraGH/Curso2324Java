package main;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		//crear array
		int [] array = new int[10];
		
		//llenar array
		for (int i = 0; i < array.length; i++) {
			int numero = rnd.nextInt(10)+1;
			array[i]=numero;
			//System.out.print(array[i]+ " ");
		}
		
		//mostrar array con while
		int i=0;
		while(i<array.length) {
			System.out.print(array[i] + " ");
			i++;
		}
		System.out.println();
		mostrarArray(array);
		
	}
	
	static void mostrarArray(int [] a) {
		int i=0;
		while(i<a.length) {
			System.out.print(a[i] + " ");
			i++;
		}
	}
	

}
