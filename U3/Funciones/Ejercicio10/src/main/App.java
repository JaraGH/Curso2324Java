package main;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		
		
		
		for (int i = 1; i <=20; i++) {
			System.out.println(dameEnteroEntre(1, 4));
		}
		
	}

	static int dameEnteroEntre(int inf, int sup) {
		
		Random rnd = new Random();
		//intercambio si sup es menor
		if (sup<inf) {
			int aux=sup;
			sup=inf;
			inf=aux;
		}
		
		int dif = sup - inf;
		
		return rnd.nextInt(dif+1) + inf;	
		
//		return rnd.nextInt(inf, sup+1);
	}
}
