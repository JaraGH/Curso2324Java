package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		char letraMinuscula = 'a';
		for (char letra='A'; letra<='Z'; letra++) {
			System.out.println(letra + "----" + letraMinuscula);
			letraMinuscula++;
		}
		
//		for (int i = 65; i <=90; i++) {
//			char letra = (char) i;		//A	
//			char letraMinuscula = (char)(i+32);
//			System.out.println(letra + "----" + letraMinuscula);
//		}
		

	}

}
