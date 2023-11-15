package main;

public class App {

	public static void main(String[] args) {
		
		int n1=220; int n2=284;
		

		boolean rtdo = sonAmigos(n1, n2);
		System.out.println(rtdo);
		
	}

	static boolean sonAmigos (int a, int b) {
		
		return (b==sumaDivisores(a) && a==sumaDivisores(b));
		
	}
	
	
	
	

	static int sumaDivisores(int numero) {
		
		int suma=0;
		for (int i = 1; i <=numero/2; i++) {
			if (numero%i==0)
				suma+=i;
		}
			
		return suma;
	}
}
