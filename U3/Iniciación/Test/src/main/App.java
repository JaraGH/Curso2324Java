package main;

public class App {

	public static void main(String[] args) {
	
		double b = 20.5;
		int a = 30; 
		//¿?
		int c = (int) b;
		c+=a;
		System.out.println(c);
		
		
		System.out.println("**********************");
		
		boolean encendido = true;
		boolean apagado = !encendido;
		System.out.println(apagado);
		
		System.out.println("**********************");
		
		int h=10;
		if (h%2==0 && h%5==0)
			System.out.println(h++);
		System.out.println(h);
	}

}
