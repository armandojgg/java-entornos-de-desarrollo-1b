package modelos;

/**
 * Clase que representa un rectangulo. Contiene metodos
 * para calcular su area y perimetro.
 * 
 * @version 1.0
 * 
 * @author Armando
 */

public class Rectangulo extends Figura {
	
	private double base;
	private double altura;
	
	/**
	 * Constructor por defecto. Crea un rectangulo con base y altura 1,
	 * en metros
	 */
	
	public Rectangulo() {
		this.base = 1;
		this.altura = 1;
	}
	
	/**
	 * Constructor que recibe como parametros la base y la altura del rectangulo, 
	 * en metros.
	 * 
	 * @param base		La base del rectangulo, en metros
	 * @param altura	La altura del rectangulo, en metros
	 */
	
	public Rectangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * @see modelos.Figura#area()
	 */
	
	@Override
	public double area() {
		return base * altura;
	}
	
	/**
	 * @see modelos.Figura#perimetro()
	 */
	
	@Override
	public double perimetro() {
		return 2*base+ 2*altura;
	}
}