package main;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		//crear array
		int [] array = new int[10];
		
		//llenar array
		for (int i = 0; i < array.length; i++) {
			int numero = rnd.nextInt(100)+1;
			array[i]=numero;
			
			System.out.print(array[i]+ " ");
		}
		
		
		System.out.println(sonIgualesPriUlt(array));
		
		
	}
	
	static boolean sonIgualesPriUlt(int [] a) {
		return (a[0]==a[a.length-1]);
//		if (a[0]==a[a.length-1])
//			return true;		
//		else
//			return false;
	}
	

}
