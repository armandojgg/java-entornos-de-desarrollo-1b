package util;

public abstract class Funciones {
	
	public static int sumatorio(int numero) {
		
		if (numero < 0) 
			throw new IllegalArgumentException("El numero debe ser mayor o igual a 0");
		
		int sumatorio = 0;
		
		for (int i= 0; i <= numero; i++) {
			sumatorio += 1;
		}
		
		return sumatorio;
	}
}
