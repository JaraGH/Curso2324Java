package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner entrada = new Scanner(System.in);
		
		String opcion="";
		
		do {
			
			System.out.println("**Menú**");
			System.out.println("1. Pares del 40 al 60");
			System.out.println("2. Impares del 99 al 77");
			System.out.println("3. Salir");
			System.out.println("Elige opción: ");
			
			opcion = entrada.next();
			
			
			switch (opcion) {
			case "1":
				for (int i = 40; i<=60; i+=2) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			case "2":
				for (int i = 99; i>=77; i-=2) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			case "3":
				System.out.println("Fin");
				break;	
			default:
				System.out.println("Opción errónea");
			}
			
			
		} while (!opcion.equals("3"));
		
		
		
	}

}
