package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner entrada = new Scanner(System.in);
		
		String respuesta="";
		
		do {
			
			System.out.println("Divisores...");
			
			System.out.println("\nTeclea dos enteros...");
			int n1 = entrada.nextInt();
			int n2 = entrada.nextInt();
			
			int resto = n2%n1;
			if (resto==0) {
				System.out.printf("El número %d es divisor de %d\n", n1, n2);
			}else {
				System.out.printf("El número %d no es divisor de %d\n", n1, n2);
			}
			
			System.out.println("Otra vez (s/n)");
			respuesta = entrada.next();
			
			
		} while (respuesta.equalsIgnoreCase("s"));
		
		
		
	}

}
