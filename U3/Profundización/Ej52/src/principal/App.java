package principal;



public class App {

	public static void main(String[] args) {
		
		//Solución 1. Iterar mientras cantidad > 0
//		int cantidad = 10;
//		int tipoMoneda=500;
//		
//		System.out.println("Cantidad: " + cantidad);
//		while (cantidad>0) {
//			
//			int numero = cantidad/tipoMoneda;
//			
//			String mensaje="";
//			if (tipoMoneda>=5)
//				mensaje="billetes";
//			else
//				mensaje="monedas";
//				
//			System.out.printf("%d %s de %d\n", numero, mensaje, tipoMoneda);
//			
//			//preparar la cantidad para proxima vuelta
//			int resto = cantidad%tipoMoneda;			
//			cantidad=resto;
//			
//			
//			//cambiar tipo de moneda
//			tipoMoneda = switch (tipoMoneda) {
//				case 500->200;
//				case 200->100;
//				case 100->50;
//				case 50->20;
//				case 20->10;
//				case 10->5;
//				case 5->2;
//				case 2->1;
//				default -> -1;
//			};
//		}
		
		//Solución 2. Iterar con tipoMoneda
		
		int cantidad = 100;
		int tipoMoneda=500;
		
		System.out.println("Cantidad: " + cantidad);
		while (tipoMoneda>0) {
			
			int numero = cantidad/tipoMoneda;
			
			String mensaje="";
			if (tipoMoneda>=5)
				mensaje="billetes";
			else
				mensaje="monedas";
				
			System.out.printf("%d %s de %d\n", numero, mensaje, tipoMoneda);
			
			//preparar la cantidad para proxima vuelta
			int resto = cantidad%tipoMoneda;			
			cantidad=resto;
			
			
			//cambiar tipo de moneda
			tipoMoneda = switch (tipoMoneda) {
				case 500->200;
				case 200->100;
				case 100->50;
				case 50->20;
				case 20->10;
				case 10->5;
				case 5->2;
				case 2->1;
				default -> 0;
			};
		}

	}

}
