package modelos;

/**
 * Clase que representa una figura geometrica
 * 
 * @version 1.0
 * 
 * @author Armando
 */
public abstract class Figura {
		
		/**
		 * Devuelve el área de la figura, en metros cuadrados.
		 * 
		 * @return 		El area de la figura, en metros cuadrados.
		 */
	
		public abstract double area();
		
		/**
		 * Devuelve el perimetro de la figura, en metros.
		 * 
		 * @return		El perimetro de la figura, en metros.
		 */
		
		public abstract double perimetro();
}
