package main;

public class App {

	public static void main(String[] args) {

		//crear array
		int [] v = new int[10];
		boolean [] b = new boolean[10];
		int [] numeros = {10,20,30,40,50};
		char [] vocales = {'a', 'e', 'i', 'o', 'u'};
		String [] cadenas = new String[10];
		
		//acceder a los elementos individualmente
//		System.out.println(v[0]);
//		System.out.println(v[1]);
//		System.out.println(b[0]);
//		System.out.println(numeros[0]);
//		System.out.println(vocales[0]);
		
//		vocales[1]='E';
//		//recorrer array
//		for (int i = 0; i < vocales.length; i++) {
//			System.out.println(vocales[i]);
//		}
		
		
		//llamada
		
		int s = sumaArray(numeros);
		System.out.println(s);
		
		System.out.println(sumaPrimeroUltimo(numeros));

	}
	
	static int sumaArray (int [] a) {
		int suma=0;
		for (int i = 0; i < a.length; i++) {
			suma+=a[i];
		}
		return suma;
	} 
	
	//funcion que retorne la suma de primer y utl elem.
	//del array
	static int sumaPrimeroUltimo (int [] a) {
		return a[0] + a[a.length-1];
	}
	
	
	//funcion que suma los valores pares de un array 
	//pasado como parámetro
	static int sumaValoresParesArray (int [] a) {
		int suma=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0)
				suma+=a[i];
		}
		return suma;
	}
	
	

}
