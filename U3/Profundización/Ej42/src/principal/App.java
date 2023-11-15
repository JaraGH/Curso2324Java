package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int filas =6;
		
		for (int i = 1; i <= filas; i++) {

			System.out.printf("%d-->", i);
			int numeroAsteriscos = (int) Math.pow(2, i);
			for (int j = 1; j <= numeroAsteriscos; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		

	}

}
