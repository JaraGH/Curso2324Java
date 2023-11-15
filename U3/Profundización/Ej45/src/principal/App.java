package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		char letra='F';
		for (int i = 1; i <=26; i++) {
			System.out.println(i+ "---" + letra);
			if (letra=='J')
				letra='F';
			else
				letra++;
		}
		

	}

}
