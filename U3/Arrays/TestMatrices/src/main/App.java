package main;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] m = new int[3][4];
		char [][] cars = new char[2][6];
		double [] a = {2.3, 5.5, 6.44, 7.01};
		int [][] mm = {
				{1,2,3},
				{6,7,8},
				{9,9,0}
		};
		
		//recorrer array a
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		//recorrer matriz mm
		//mm.length -> dev. nº de filas de la matriz
		for (int i = 0; i < mm.length; i++) {
			for (int j = 0; j < mm[i].length; j++) {
				System.out.print(mm[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
