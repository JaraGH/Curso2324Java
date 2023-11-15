package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		String opcion;
		do {

			System.out.println("**Menú**");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Salir");
			System.out.println("Elige opción: ");
			opcion = entrada.next();
			
			switch (opcion) {
			case "1":
				System.out.println("Teclea dos números...");
				double n1 = entrada.nextDouble();
				double n2 = entrada.nextDouble();
				double suma = n1+n2;
				System.out.printf("La suma de %f y %f es %f\n", n1, n2, suma);
				break;
			case "2":
				System.out.println("Teclea dos números...");
				n1 = entrada.nextDouble();
				n2 = entrada.nextDouble();
				double resta = n1-n2;
				System.out.printf("La resta de %f menos %f es %f\n", n1, n2, resta);
				break;
				
			case "3":
				System.out.println("Has elegido Salir");
				break;
			default:
				System.out.println("¡¡¡Opción errónea!!!");
				break;
			}
	
		} while (!opcion.equals("3"));
		
				
		
	} //del main

} //de la clase
