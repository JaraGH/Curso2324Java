package main;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		for (int i = 0; i <=12; i++) {
			System.out.println(nombreMes(i));
		}
		
	}

	static String nombreMes(int numeroMes) {
		return 
		switch (numeroMes) {
		case 1 -> "Enero";
		case 2 -> "Febrero"; 
		case 3 -> "Marzo";
		case 4 -> "Abril";
		case 5 -> "Mayo";
		case 6 -> "Junio"; 
		case 7 -> "Julio";
		case 8 -> "Agosto";
		case 9 -> "Septiembre";
		case 10 -> "Octubre";
		case 11 -> "Noviembre";
		case 12 -> "Diciembre";
		
		
		default -> "Error";
		};
		
	}
}
