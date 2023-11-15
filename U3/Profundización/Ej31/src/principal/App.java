package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String repetir;
		do {
			System.out.print("Año? ");
			int anio = entrada.nextInt();
			// año es bisiesto si es divisible entre cuatro y no es divisible entre 100 ó es
			// divisible entre 400.
			if ((anio % 4 == 0 && anio % 100 != 100) || anio % 400 == 0) {
				System.out.printf("%d es bisiesto", anio);
			} else {
				System.out.printf("%d no es bisiesto", anio);
			}
			System.out.println("\nOtra vez(s/n)?");
			repetir=entrada.next();
		} while (repetir.equalsIgnoreCase("s"));

	}

}
