package main;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		int [] a= {1,66,15,33,2,34,65,39,15,78};
	
		System.out.print("Array antes: ");
		mostrarArray(a);
		
		//intercambiar prim y utlm
		int aux = a[0]; // aux=1
		a[0] = a[a.length-1]; //0-> 78
		a[a.length-1]=aux;
		

		System.out.print("\nArray después: ");
		mostrarArray(a);
		
		
		
	}
	
	static void mostrarArray(int [] a) {
		int i=0;
		while(i<a.length) {
			System.out.print(a[i] + " ");
			i++;
		}
	}

}
