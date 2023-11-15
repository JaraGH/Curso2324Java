package main;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		int [] a= {1,66,15,33,200,34,65,39,15,78};
				
		int mayor = dameElMayor(a);
		System.out.println(Arrays.toString(a));
		System.out.println("El mayor es " + mayor);
		
		System.out.println("El mayor " + dameElMayor(a));
		
	}
	
	static int dameElMayor(int [] b) {
		int mayor=b[0];
		for (int i = 1; i < b.length; i++) {
			if (b[i]>mayor)
				mayor=b[i];
		}
		return mayor;
	}

}
