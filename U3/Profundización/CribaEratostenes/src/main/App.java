package main;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		Random rnd = new Random();
		//primos menores q 100
		int numero=100;
		
		List<Integer> lista = rnd.ints(99, 2, 99).boxed().collect(Collectors.toList());
		
		

		
			
	}

}
