package main;

public class App {

	public static void main(String[] args) {
		
		mostrarCaracteresEntre('f', 'a');
	
	}

	static void mostrarCaracteresEntre (char inicio, 
			char fin) {
		
		if (inicio>fin) {
			char aux=inicio;
			inicio=fin;
			fin=aux;
		}
		for (char caracter = inicio; caracter <=fin; caracter++) {
			System.out.println(caracter);
		}
		
	}

}
