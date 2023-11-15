package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Teclea un entero: ");
		int numero = entrada.nextInt();
	
		
		if (numero % 2 ==0) {
			System.out.printf("%d es par", numero);
		} else {
			System.out.printf("%d es impar", numero);
		}
		
		
		
	}

}
