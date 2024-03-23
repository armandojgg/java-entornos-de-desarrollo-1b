package app;

import modelos.Model.Circulo;
import modelos.Model.Rectangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo cr = new Circulo();
		Rectangulo r = new Rectangulo();
		
		Circulo cr2 = new Circulo(5);
		Rectangulo r2 = new Rectangulo(6, 7);
		
		System.out.println(cr.obtenerPerimetro());
		System.out.println(cr2.obtenerArea());
		System.out.println(r2.obtenerPerimetro());
		System.out.println(r.obtenerArea());

	}

}
