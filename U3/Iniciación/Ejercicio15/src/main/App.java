package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Teclea dos enteros: ");
		int numero1 = entrada.nextInt();
		int numero2 = entrada.nextInt();
		
		if (numero1>numero2) {
			System.out.printf("%d - %d", numero2, numero1);
		} else if (numero2>numero1) {
			System.out.printf("%d - %d", numero1, numero2);
		}else {
			System.out.printf("%d y %d son iguales", numero2, numero1);
		}
	}

}
