package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int filas=7;
		
		for (int i = 1; i <=filas; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
