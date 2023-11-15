package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		String resp = "";

		do {

			System.out.print("Teclea un carácter: ");
			char caracter = entrada.next().charAt(0);

			if (caracter >= 'A' && caracter <= 'Z')
				System.out.printf("%c es una letra mayúscula", caracter);
			else if (caracter >= 'a' && caracter <= 'z')
				System.out.printf("%c es una letra minúscula", caracter);
			else if (caracter >= '0' && caracter <= '9')
				System.out.printf("%c es un dígito", caracter);
			else
				System.out.printf("%c no es ni mayúscula, ni minúscula, ni dígito", caracter);

			System.out.print("\n¿Otra vez (s/n)?");
			resp = entrada.next();

		} while (resp.equalsIgnoreCase("s"));
	}

}
