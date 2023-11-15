package principal;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		//10 numeros entre 1 y 500
		
		int mayor=0; int menor=0;
		for (int i = 1; i <=10; i++) {
			int numero = rnd.nextInt(500)+1;
			System.out.println(numero);
			
			if (numero>mayor || i==1)  //i==1, indica si es pla primera vuelta
				mayor=numero;
			if (numero<menor || i==1)
				menor=numero;
			
		}
		
		System.out.printf("Mayor: %d\n", mayor);
		System.out.printf("Menor: %d\n", menor);

	}

}
