package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Teclea tres números: ");
		double numero1 = entrada.nextInt();
		double numero2 = entrada.nextInt();
		double numero3 = entrada.nextInt();
	
		double media = (numero1+numero2+numero3)/3;
		
		System.out.printf("La media %.2f es ", media);
		if (media>10) {
			System.out.println(" superior a diez");
		} else if (media<10) {
			System.out.println(" inferior a diez");
		} else {
			System.out.println(" igual a diez");
		}
		
		
		
	}

}
