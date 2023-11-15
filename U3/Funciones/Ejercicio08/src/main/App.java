package main;

public class App {

	public static void main(String[] args) {
		
		for (double i = 0; i < 10.0; i+=0.5) {
			System.out.printf("ºC: %2.3f, ºK: %2.3f, ºF: %2.3f\n"
					, i, gradosCK(i), gradosCF(i));
		}
		
	}

	static double gradosCF (double centigrados) {
		return centigrados * 9 / 5 + 32;
	}
	
	static double gradosCK (double centigrados) {
		return centigrados + 273.15;
	}
}
