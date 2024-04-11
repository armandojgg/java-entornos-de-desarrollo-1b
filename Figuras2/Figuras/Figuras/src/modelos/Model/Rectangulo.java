package modelos.Model;


/**
 *  Representa un Rectangulo en el mundo real.
 */
public class Rectangulo extends Figura {
	
	private double base;
	private double altura;
    
    /**
     * Constructor por defecto.
     */
    public Rectangulo() {
    	this.base = 1;
    	this.altura = 1;
    }

    /**
     * Constructor que recibe como parametros la base y la altura del rectángulo en cuestión.
     * 
     * @param base 			La base del rectángulo.
     * @param altura 		La altura del rectángulo.
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     *  Devuelve la base del rectangulo.
     */
    public double getBase() {
        return base;
    }

    /**
     *  Devuelve la altura del rectangulo.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define la base del rectangulo.
     * @param Base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Define la altura del rectangulo.
     * @param Altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Nos muestra la base y la altura del rectangulo.
     */
    public String toString() {
        return "base: " + base + " altura: " + altura;
    }

    /**
     * Este metodo calcula el area del rectangulo.
     * @return Area
     */
    
    @Override
    public double obtenerArea() {
        return base * altura;
    }

    /**
     * Este metodo calcula el perimetro del rectangulo.
     * @return Perimetro
     */
    
    @Override
    public double obtenerPerimetro() {
        return (2 * base) + (2 * altura);
    }

}