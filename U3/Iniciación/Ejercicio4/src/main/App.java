package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Teclea tu nombre: ");
		String nombre = entrada.nextLine();
		
//		Calculamos la edad a partir del año de nacimiento y el actual.
//		Aunque esto puede dar lugar a errores si aún no ha cumplido años.
		System.out.println("Teclea tu año de nacimiento: ");
		int anioNacimiento = entrada.nextInt();
		
		int edad = 2023 - anioNacimiento;
		System.out.printf("%s, tienes %d años.", nombre, edad);
		
		
		
//		Así es como debería hacerse
//		System.out.println("Teclea tu fecha de nacimiento (aaaa-mm-dd): ");
//		String fNac = entrada.nextLine();
//		
//		Period edad = Period.between(LocalDate.parse(fNac), LocalDate.now());
//		
//		System.out.printf("%s, tienes %d años.", nombre, edad.getYears());
		

	}

}
