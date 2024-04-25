package modelos;

public class Persona {

	String nombre;
	String apellidos;
	int edad;

	/**
	 * 
	 * Recibe los tres parametros y lanza una excepcion.
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */

	public Persona(String nombre, String apellidos, int edad) {
		if (edad < 0 || edad >= 130)
			throw new IllegalArgumentException("La edad debe ser mayor a 0 años y menor que 130");
	}
	
	public String mostrarEdad(Persona persona) {
		if (persona.getEdad() < 18) {
			return "Es menor de edad";
		} else if (persona.getEdad() >= 18 || persona.getEdad() <= 65) {
			return "Es mayor de edad";
		} else {
			return "Está jubilado/a";
		}
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

}
