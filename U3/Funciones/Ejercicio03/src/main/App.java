package main;

public class App {

	public static void main(String[] args) {
		
		for (int anio = 2000; anio <=2023; anio++) {
			System.out.printf("Es bisitesto %d? %b\n", anio, 
					esBisiesto(anio));
		}
		
	}

	static boolean esBisiesto (int anio) {
//		//año es bisiesto si es divisible entre cuatro 
//		y no es divisible entre 100 
//		ó es divisible entre 400
		
		return ((anio%4==0 && anio%100!=0) || anio%400==0);
	}

}
