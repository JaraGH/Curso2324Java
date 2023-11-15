package principal;



public class App {

	public static void main(String[] args) {
		
		int numero = 1223;
		int suma=0;
		String num = Integer.toString(numero);
		for (int i = 0; i < num.length(); i++) {
			char digito = num.charAt(i);
			String d = digito+""; //'1' -> "1"			
			int valor = Integer.parseInt(d);  //"1" --> 1
			suma+=valor;
		}
		System.out.println(suma);

	}

}
