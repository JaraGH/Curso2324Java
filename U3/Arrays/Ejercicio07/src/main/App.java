package main;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		int [] a= {1,66,15,33,2,34,65,39,15,78};
//	
		System.out.println("Original: " + Arrays.toString(a));
		
		arrayAlternoPosNeg(a);
		
		System.out.println("Modificado: " + Arrays.toString(a));
		
		
	}
	
	
	static int [] arrayAlternoPosNeg(int [] b) {
		
		for (int i = 0; i < b.length; i++) {
			if (i%2!=0)
				b[i]=b[i]*-1;
						
		}
		return b;
	}

}
