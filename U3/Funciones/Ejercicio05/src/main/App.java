package main;

public class App {

	public static void main(String[] args) {
		
		double m = media(140,23,33);
		
		System.out.println("La media: " + m);
		
	}

	static double media(int a, int b, int c) {
		return (a+b+c)/3.0;
	}

}
