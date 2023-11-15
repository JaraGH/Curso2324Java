package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Teclea un entero: ");
		int numero1 = entrada.nextInt();
	
		
		if (numero1>=0) {
			System.out.printf("%d es postivo", numero1);
		} else {
			System.out.printf("%d es negativo", numero1);
		}
	}

}
