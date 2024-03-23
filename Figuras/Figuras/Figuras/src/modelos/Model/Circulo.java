package modelos.Model;


/**
 * Representa un circulo en el mundo real.
 */
public class Circulo extends Figura {
	
	private double radio;
    private final double pi = 3.14159;
	
	
    /**
     * Constructor por defecto.
     */
    public Circulo() {
    	this.radio = 1;
    }

    /**
     * Constructor que recibe como parametros el radio del círculo y el número pi en el mundo real.
     * 
     * @param radio 		El radio del círculo.
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Nos devuelve el numero del radio en cuestion.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Indica el radio.
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Nos devuelve el numero pi en cuestion.
     */
    public double getPi() {
        return pi;
    }
    
    /**
     * Nos muestra el radio y el numero pi.
     */
    public String toString() {
       return "radio: " + radio + " pi: " + pi;
    }

    /**
     * Este metodo hace que calcule el Area del circulo.
     * @return Area
     */
    @Override
    public double obtenerArea() {
       return pi * Math.sqrt(radio);
    }

    /**
     * Este metodo hace que calcule el Perimetro del circulo.
     * @return Perimetro
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * pi * radio;
    }

}