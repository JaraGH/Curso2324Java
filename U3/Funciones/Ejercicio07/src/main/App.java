package main;

public class App {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 6; i++) {
			int fact = factorial(i);
			System.out.printf("Factorial de %d: %d\n", i, fact);
		}
		
	}

	static int factorial (int a) {
		int f=1;
		for (int i = 2; i <=a; i++) {
			f*=i;
		}
		return f;
	}
	
	
	
	static int factorialRecursivo (int a) {
		if (a==0 || a==1)
			return 1;
		else
			return a * factorialRecursivo(a-1);
	}
	
}
