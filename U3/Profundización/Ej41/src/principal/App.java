package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
int filas =6;
		
		for (int i = 1; i <= filas; i++) {

			System.out.printf("%d-->", i);
			
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
		

	}

}
